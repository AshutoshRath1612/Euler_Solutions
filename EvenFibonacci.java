package Euler_Solutions;

public class EvenFibonacci {
    public static void main(String[] args) {
        int sum =0;
        int x=1;
        int y=2;
        while (x<4000000){
            if (x%2==0)
                sum+=x;
            int temp = x+y;
            x=y;
            y=temp;
        }
        System.out.println(sum);
    }
}
