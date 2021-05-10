package Day2;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        //char c;
        int numbers = 0;
        int upperLetters = 0;
        int lowerLetters = 0;
        int symbols = 0;
        boolean validPassword = false;
        System.out.print("Enter your password -> ");
        password = scanner.nextLine();
        if (password.length() >= 6 && password.length() <= 16) {
            for (int i = 0; i < password.length(); i++) {
                if (password.charAt(i) == '$' || password.charAt(i) == '#' || password.charAt(i) == '@') {
                    symbols++;
                } else if (97 <= password.charAt(i) && password.charAt(i) <= 122) {
                    lowerLetters++;
                } else if (65 <= password.charAt(i) && password.charAt(i) <= 90) {
                    upperLetters++;
                } else if (49 <= password.charAt(i) && password.charAt(i) <= 57) {
                    numbers++;
                }
            }
            if (symbols >= 1 && lowerLetters >= 1 && upperLetters >= 1 && numbers >= 1) {
                validPassword = true;
                System.out.print("Password accepted");
            }
        } else {
            validPassword = false;
            System.out.print("Password should have 8-16 symbols and contain \n a-z, A-Z, 0-9 and at least one symbol from $, #, @ ");
        }


    }
}

