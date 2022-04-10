import java.util.Scanner;

public class C1070 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        /*
        if (a == 12) {
            System.out.println("winter");
        } else if (a == 1) {
            System.out.println("winter");
        } else if (a == 2) {
            System.out.println("winter");
        } else if (a == 9) {
            System.out.println("fall");
        } else if (a == 10) {
            System.out.println("fall");
        } else if (a == 11) {
            System.out.println("fall");
        } else if (a == 6) {
            System.out.println("summer");
        } else if (a == 7) {
            System.out.println("summer");
        } else if (a == 8) {
            System.out.println("summer");
        } else if (a == 3) {
            System.out.println("spring");
        } else if (a == 4) {
            System.out.println("spring");
        } else if (a == 5) {
            System.out.println("spring");
        }
         */
        switch (a) {
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
            case 9:
            case 10:
            case 11:
                System.out.println("fall");
        }
    }
}
