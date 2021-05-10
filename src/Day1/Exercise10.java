package Day1;

public class Exercise10 {
    public static void main(String[] args) {
        int count = 0;
        for (int asciiValue = 32; asciiValue <= 122; asciiValue++) {
            System.out.print((char) asciiValue + " ");
            count++;
            if (count % 10 == 0) {
                System.out.print((char) asciiValue + " " + "\n");
            }
        }
    }
}
