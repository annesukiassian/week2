package Day5;

import java.util.Scanner;

//The first term and the denominator of the geometric progression are given (real numbers b1 and q, q! = 0).
// An integer n is also given. Print the n-th term of a geometric progression.
public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the b1, q, bn -> ");
        double b1 = scanner.nextDouble();
        double q = scanner.nextDouble();
        double bn = scanner.nextDouble();
        int count = 0;
        double result = 1;
        while (result <= bn) {
            result = b1 * q;
            b1 = result;
            count++;

        }
        System.out.print(count);
    }
}
