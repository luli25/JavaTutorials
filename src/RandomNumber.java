import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {
        Random random = new Random();
        int numA = random.nextInt(100);
        int numB = random.nextInt(500);
        int numC = random.nextInt(1000);
        System.out.println("Random number between 0 and 100: " + numA);
        System.out.println("Random number between 0 and 500: " + numB);
        System.out.println("Random number between 0 and 1000: " + numC);
    }
}
