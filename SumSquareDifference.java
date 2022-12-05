package Euler_Solutions;

/*
The sum of the squares of the first ten natural numbers is,

The square of the sum of the first ten natural numbers is,

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class SumSquareDifference {
    public static void main(String[] args) {
        int n=100;
        int sumofsquare = (n*(n+1)*(2*n+1))/6;
        int squareofsum = (int)Math.pow((n*(n+1)/2),2);
        System.out.println(squareofsum-sumofsquare);
    }
}
