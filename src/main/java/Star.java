import java.util.Scanner;

public class Star {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("구구단 몇 단 : ");
        int F = scan.nextInt();
        //System.out.println(F);
        int g;
        for( g = 1; g < 10; g++)
        { System.out.printf("%d x %d = %d\n", F, g, (F*g));}
        // 반복문  printf로 구구단 만들기
    }
}
