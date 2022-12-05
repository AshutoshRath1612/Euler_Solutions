package Euler_Solutions;

/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class LargestPalindromeProduct {
    public static boolean isPalindrome(int x){
        String s = Integer.toString(x);
        for (int i=0;i<s.length()/2;i++){
            if (s.charAt(i)!= s.charAt(s.length()-1-i))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int maxPalinnum = -1;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int product = i * j;
                if (isPalindrome(product) && product > maxPalinnum)
                    maxPalinnum = product;
            }
        }
        System.out.println(maxPalinnum);
    }
}
