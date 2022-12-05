package Euler_Solutions;

/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Multipleof3or5 {
    public static int multiplesum(int n){
        int sum=0;
        for(int i=3;i<n;i++){
            if(i%3==0 || i%5==0)
                sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n =1000;
        int sum = multiplesum(n);
        System.out.println("The sum of the multiples is "+ sum);
    }
}
