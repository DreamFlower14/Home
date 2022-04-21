import java.util.Scanner;

public class Test0420 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int inc = a;
        int dec = a;

        for (int i = 0; i < (a*2)-1; i++) {
            for (int j = 1; j <= inc; j++) {
                if (j < dec) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
            if(i < a-1) {
                inc++;
                dec--;
            }else{
                inc--;
                dec++;
            }
        }
    }
}