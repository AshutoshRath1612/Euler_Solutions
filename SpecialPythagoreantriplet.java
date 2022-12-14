package Euler_Solutions;

/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */
public class SpecialPythagoreantriplet {
    public static void main(String[] args) {
        int sum=1000;
        for (int a=1;a<sum;a++){
            for (int b=a+1;b<sum;b++){
                int c = sum -a-b;
                if (a*a + b*b == c*c){
                    System.out.println(a*b*c);
                    return;
                }
            }
        }
    }
}
