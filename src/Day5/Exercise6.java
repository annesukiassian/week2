package Day5;

import java.util.Locale;
import java.util.Scanner;

//Uppercase and lowercase, 3 input words
public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        String lowerStr1 = "";
        String lowerStr2 = "";
        String lowerStr3 = "";
        char firstLetter1 = str1.charAt(0);
        char firstLetter2 = str2.charAt(0);
        char firstLetter3 = str3.charAt(0);
        String first1 = Character.toString(firstLetter1);
        String first2 = Character.toString(firstLetter2);
        String first3 = Character.toString(firstLetter3);
        int n1 = str1.length();
        int n2 = str2.length();
        int n3 = str3.length();
        for (int i = 0; i < n1; i++) {
            lowerStr1 = str1.toLowerCase();
        }
        for (int i = 0; i < n2; i++) {
            lowerStr2 = str2.toLowerCase();
        }
        for (int i = 0; i < n3; i++) {
            lowerStr3 = str3.toLowerCase();
        }
        System.out.print(first1.toUpperCase(Locale.ROOT));
        for (int i = 1; i < n1; i++) {
            System.out.print(lowerStr1.charAt(i));
        }
        System.out.print("\n" + first2.toUpperCase(Locale.ROOT));
        for (int i = 1; i < n2; i++) {
            System.out.print(lowerStr2.charAt(i));
        }
        System.out.print("\n" + first3.toUpperCase(Locale.ROOT));
        for (int i = 1; i < n3; i++) {
            System.out.print(lowerStr3.charAt(i));
        }
    }
}
