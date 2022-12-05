package Euler_Solutions;

public class AmicableNumber {
    public static boolean isAmicable(int n) {
        int m = divisorSum(n);
        return m != n && divisorSum(m) == n;
    }
    public static int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
            int sum = 0;
            for (int i = 1; i < 10000; i++) {
                if (isAmicable(i))
                    sum += i;
            }
        System.out.println(sum);
    }
}
