import java.util.Scanner;

public class FibonacciSeriesWithInput {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want in the series: ");
        int count = scan.nextInt();
        scan.close();
        System.out.println("Fibonacci series of " +count+ "numbers: ");
        int i = 1;
        while (i <= count) {
            System.out.println(num1 + " ");
            int sumPrevNum = num1 + num2;
            num1 = num2;
            num2 = sumPrevNum;
            i++;
        }
    }
}
