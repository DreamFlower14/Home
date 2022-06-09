package CodeUp;

import java.util.Scanner;

public class C1410 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int c1 = 0,c2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if ( str.charAt(i) == '('){
                c1++;
            }else if ( str.charAt(i) == ')'){
                c2++;
            }
        }
        System.out.print(c1 + " ");
        System.out.println(c2);
    }
}
