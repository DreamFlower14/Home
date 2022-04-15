import java.util.Scanner;

public class C1076 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char a = s.next().charAt(0);
        int b = 97;

        while ((char)b <= a) {
            System.out.printf("%c ", b);
            b++;
        }
    }
}