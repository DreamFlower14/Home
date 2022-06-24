package CodeUp;

import java.util.Scanner;

public class C1419 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int cnt = 0;

        for (int i = 0; i < str.length()-3; i++) {
            if ((str.charAt(i)=='l')||(str.charAt(i+1)=='o')||(str.charAt(i+2)=='v')||(str.charAt(i+3)=='e')){
                cnt++;
            }
        }


        System.out.println(cnt);
    }
}