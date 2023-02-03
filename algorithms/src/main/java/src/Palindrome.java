package src;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(11));
    }
    //Given an integer x, return true if x is a
    //palindrome
    //, and false otherwise.
    static boolean isPalindrome(int x){
        String y = Integer.toString(x);

        int i = 0;
        int j = y.length() - 1;

        while(i <= y.length()/2){
            if(y.charAt(i) != y.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
