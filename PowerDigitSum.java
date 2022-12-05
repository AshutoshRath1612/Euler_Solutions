package Euler_Solutions;

import java.math.BigInteger;

/*
215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 21000?
 */
public class PowerDigitSum {
    public static void main(String[] args) {
        BigInteger num = BigInteger.TWO.pow(1000);
        String numstr = num.toString();
        int sum=0;
        for (int i=0;i<numstr.length();i++){
            sum += numstr.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
