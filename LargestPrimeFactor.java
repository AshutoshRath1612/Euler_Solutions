package Euler_Solutions;

/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */
public class LargestPrimeFactor {
    public static long primeFactor(long n){
        long maxprime=Integer.MIN_VALUE;
        for (long i = (long) Math.sqrt(n); i>=2; i--){
            if (n%i==0 && isprime(i))
               return i;
        }
        return maxprime;
    }
    public static boolean isprime(long n){
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        long n =600851475143l;
        long largestfactor = primeFactor(n);
        System.out.println(largestfactor);
    }
}
