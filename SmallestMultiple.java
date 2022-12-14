package Euler_Solutions;

/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class SmallestMultiple {
    public static int findlcm(int x,int y){
        return (x*y)/gcd(x,y);
    }
    public static int gcd(int x,int y){
        if (x<y)
            return gcd(y,x);
        int gcd=1;
        for(int i = 1; i <= x && i <= y; i++)
        {
            if(x%i==0 && y%i==0)
                gcd = i;
        }
        return gcd;
    }
    public static void main(String[] args) {
            int alllcm=1;
            for (int i=2;i<=20;i++){
                alllcm = findlcm(i,alllcm);
            }
        System.out.println(alllcm);
    }
}
