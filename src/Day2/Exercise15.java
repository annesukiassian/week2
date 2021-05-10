package Day2;

public class Exercise15 {
    public static void main(String[] args) {
        System.out.print("* | ");
        for (int x = 1; x <= 10; x++) {
            System.out.print(x + " ");
        }
        System.out.print("\n");
        for (int y = 1; y <= 32; y++) {
            System.out.print("_");
        }
        System.out.print("\n");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.print("\n");
        }
    }
}
