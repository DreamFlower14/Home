package CodeUp;

import java.util.Scanner;

public class C1018 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
       String[] li = str.split("");

        for (int i = 0; i < li.length; i++) {
            System.out.print(li[i]);
        }
    }
}
