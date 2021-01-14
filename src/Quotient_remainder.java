import java.util.Scanner;

public class Quotient_remainder {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number ");
        float num1 = scan.nextFloat();
        System.out.println("Enter another number ");
        float num2 = scan.nextFloat();
        scan.close();
        float quotient = num1 / num2;
        float remainder = num1 % num2;
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}
