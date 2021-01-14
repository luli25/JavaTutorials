package Arrays;

public class SumArrayElements {

    public static void main(String[] args) {
        int[] array = {10, 25, 9, 50, 100};
        int sum = 0;
        for (int num : array) {
            sum = sum + num;
        }

        System.out.println("Sum of array: " + sum);
    }

}
