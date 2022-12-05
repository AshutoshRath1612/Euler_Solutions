package Euler_Solutions;

public class Lexicographical_Permutations {
    public static boolean nextPermutation(int[] arr) {
        int i = arr.length - 1;
        for (; i > 0 && arr[i - 1] >= arr[i]; i--);
        if (i <= 0)
            return false;
        {
            int j = arr.length - 1;
            for (; arr[j] <= arr[i - 1]; j--);
            int temp = arr[i - 1];
            arr[i - 1] = arr[j];
            arr[j] = temp;
        }
        for (int j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++)
            array[i] = i;

        // Permute
        for (int i = 0; i < 999999; i++) {
            nextPermutation(array);
        }

        // Format output
        String ans = "";
        for (int i = 0; i < array.length; i++)
            ans += array[i];
        System.out.println(ans);
    }
}
