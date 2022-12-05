package Euler_Solutions;

public class ReciprocalCycle {
    public static void main(String[] args) {
        int length = 0;
        int num =0;
        for (int i = 1000; i > 1; i--) {
            if (length >= i) {
                break;
            }

            int[] remainders = new int[i];
            int value = 1;
            int index = 0;

            while (remainders[value] == 0 && value != 0) {
                remainders[value] = index;
                value *= 10;
                value %= i;
                index++;
            }

            if (index -remainders[value] > length) {
                length = index - remainders[value];
                num=i;
            }
        }
        System.out.println(num + " with "+ length+ " recurring cycle.");
    }
}
