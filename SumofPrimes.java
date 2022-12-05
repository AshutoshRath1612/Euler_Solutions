package Euler_Solutions;

/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
 */
public class SumofPrimes {
    public static long sumprimes(long n){
        int arr[]= new int[(int) n+1];
        arr[0]=1;
        arr[1]=1;
        for (int i=2;i<Math.sqrt(n);i++){
            if (arr[i]==0){
                for (int j=i*2;j<=n;j+=i){
                    arr[j]=1;
                }
            }
        }
        long primesum=0;
        for (int i=0;i<=n;i++){
            if (arr[i]==0)
                primesum+=i;
        }
        return primesum;
    }
    public static void main(String[] args) {
        long n=2000000;
        long sum =sumprimes(n);
        System.out.println(sum);
    }
}
