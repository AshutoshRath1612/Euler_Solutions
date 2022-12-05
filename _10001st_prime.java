package Euler_Solutions;

/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
 */
public class _10001st_prime {
    public static boolean isprime(int n){
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int count=0;
        int i=2;
        while (count!=10001){
            if (isprime(i)) {
                count++;
            }
            i++;
        }
        System.out.println(i);
    }
}
