package Day5;

import java.util.Scanner;
//Determine how many hours and minutes the digital clock will show at this moment.
public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N-> ");
        int inputNumber = scanner.nextInt();
        int hours = 0;
        int days = 0;
        int minutes = 0;
        int remainder = 0;
        if (inputNumber < 1440) {
            hours = inputNumber / 60;
            minutes = inputNumber % 60;
            System.out.print(hours + " hours " + minutes + " minutes");
        } else if (inputNumber >= 1440) {
            days = inputNumber / 1440;
            remainder = inputNumber - (days * 1440);
            hours = remainder / 60;
            minutes = remainder % 60;
            System.out.print(days + " days " + hours + " hours " + minutes + " minutes");

        }
    }
}
