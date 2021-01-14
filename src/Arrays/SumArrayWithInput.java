package Arrays;

import java.util.Scanner;

public class SumArrayWithInput {

    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the elements in the array: ");
        for(int i = 0; i < 10; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();
        int sum = 0;
        for(int num : array) {
            sum = sum + num;
        }

        System.out.println("Sum of array elements is: " + sum);
    }
}
