package src;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    public static void main(String[] args) {
        int [] integers = {2,3,1,23,4,5,6,7};
        int target = 13;
        int[] answer = twoSum(integers,target);

        for(int i : answer){
            System.out.println(i);
        }
    }

    static int[] twoSum(int[] input, int target) {
       Map <Integer,Integer> map = new HashMap<>();
       int[] output = {};

       for(int i = 0; i < input.length ; i++){
           int x = Math.abs(input[i] - target);
           if(!map.containsKey(x)){
               map.put(input[i],i);
           }else{
               System.out.printf(
                       "Returning : (value :%s, index: %s) & (value :%s, index: %s) sum to be target : %s",
                       input[i],i,x,map.get(x),target
               );
               return output;
           }

       }

       return null;
    }
}
