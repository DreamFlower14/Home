package CodeUp;

import java.util.Scanner;

public class C1295 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) > 64) && (str.charAt(i) < 91)){
                System.out.print((char)(str.charAt(i) + 32));
            }else if ((str.charAt(i) > 96) && (str.charAt(i) < 123)){
                System.out.print((char)(str.charAt(i) - 32));
            }else {
                System.out.print(str.charAt(i));
            }
        }

    }
}
