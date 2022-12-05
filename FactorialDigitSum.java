package Euler_Solutions;

import java.math.BigInteger;

/*
n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!
 */
public class FactorialDigitSum {
    public static BigInteger factorial(int n){
        BigInteger fact=BigInteger.ONE;
        for (int i=1;i<=n;i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
    public static int factorialsum(BigInteger n){
        int sum=0;
        String fact = n.toString();
       for (int i=0;i<fact.length();i++){
           sum+=fact.charAt(i) - '0';
       }
        return sum;
    }
    public static void main(String[] args) {
        int n=100;
        BigInteger factorial = factorial(n);
        int factorialsum = factorialsum(factorial);
        System.out.println(factorialsum);
    }
}
