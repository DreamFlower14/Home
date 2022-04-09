//import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.printf("몇 줄을 만드시겠습니까 : ");
//        int a = sc.nextInt();

        int inc = 3, dec = 3;  // 3에서 기준점을 잡으면 3줄짜리 피라미드만 가능하지 않나?

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= inc; j++) {
                if ( j < dec){
                    System.out.print(" ");
                }else if ( j <= inc){
                    System.out.print("*");
                }
            }
            System.out.println();
            inc++;
            dec--;
        }
    }
}
