package CodeUp;

import java.io.PrintStream;
import java.util.Scanner;

public class C1019 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] li = str.split("\\.");

        System.out.print(li[0]);
        PrintStream printf = System.out.printf("%02d", (int)li[1]);
    }
}
