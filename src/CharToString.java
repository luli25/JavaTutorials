public class CharToString {

    public static void main(String[] args) {
        //Method 1: Using toString()
        char ch1 = 'a';
        char ch2 = 'b';
        char ch3 = 'c';
        String str1 = Character.toString(ch1);
        String str2 = Character.toString(ch2);
        String str3 = Character.toString(ch3);
        System.out.println("Method 1: " + str1 + str2 + str3);

        //Method 2: Using ValueOf()
        str1 = String.valueOf(ch1);
        str2 = String.valueOf(ch2);
        str3 = String.valueOf(ch3);
        System.out.println("Method 2: " + str1 + str2 + str3);
    }
}
