package Home;

import java.util.Scanner;

public class H0519 {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        String str = s.nextLine();

        int len;
        len = str.length();

        System.out.println("문자열 : " + str);
        System.out.println("문자열 길이 : " + len);

        for (int i = 0; i < len; i++) {
            if ( str.charAt(i) == ' ' ){
                System.out.print('-');
            }else {
                System.out.print(str.charAt(i));
            }
        }
    }
}
