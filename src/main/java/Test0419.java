import java.util.Scanner;

public class Test0419 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int gop = 1;

        for (int i = 1; i <= a; i++) {
            gop *= i;  // 1*2*3*4*5
        }
        System.out.println(gop);
    }
}
