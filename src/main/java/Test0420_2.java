import java.util.Scanner;
public class Test0420_2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int inc = 0;
        int dec = a*2-1;

        for (int i = 0; i < (a*2)-1; i++) {
            for (int j = 0; j < dec; j++) {
                if (j < inc){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
            if (i < a-1){
            inc++;
            dec--;
            } else{
                inc--;
                dec++;
            }
        }
    }
}