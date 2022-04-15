import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 줄을 만드시겠습니까 : ");
        int a = sc.nextInt();

        int inc = a,dec = a ;                    // 3에서 기준점을 잡으면 3줄짜리 피라미드만 가능하지 않나?

        for (int i = 1; i <= a; i++) {           // 입력받은 수만큼 행을 출력한다
            for (int j = 1; j <= inc; j++) {
                if ( j < dec){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
            inc++;
            dec--;
        }
    }
}