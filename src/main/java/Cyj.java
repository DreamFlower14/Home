import java.util.Scanner;

public class Cyj {
    public static void main(String[] args) {
        float c = 1.23f;
        System.out.printf("%9.3f\n",c);

        Scanner sc = new Scanner(System.in);
        System.out.print(" 공부를 1시간동안 했지만 아직 잘모르겟어요 얼마나 해야할까요? : " );
        int y = sc.nextInt();
        System.out.println( y + "분 공부하세여!! ");
    }
}
