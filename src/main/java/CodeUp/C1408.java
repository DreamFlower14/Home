package CodeUp;

import java.util.Scanner;

public class C1408 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        for (int i = 0; i < str.length(); i++) {
            System.out.print((char)(str.charAt(i) + 2));
        }
        System.out.println();
        for (int i = 0; i < str.length(); i++) {
            System.out.print((char)((str.charAt(i) * 7 ) % 80+ 48));
        }
    }
}
