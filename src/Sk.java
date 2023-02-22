/*public class Sk {
}*/


import java.util.Scanner;
public class Sk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        System.out.println("sample");
        char ch = input.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel.");

        } else {
            System.out.println(ch + " is a consonant.");
        }
    }
}
