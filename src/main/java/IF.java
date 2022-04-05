import java.util.Scanner;
public class IF {
    public static void main(String[] args) {


        Scanner ashdkashdkasd = new Scanner(System.in);
        System.out.print("점수를 입력해줘요 : ");
        int a = ashdkashdkasd.nextInt();

        if (a >= 90){  // 맞으면
            System.out.println("A");
        }else if ( a >= 80 ){
            System.out.println("B");
        }else if ( a >= 70 ){
            System.out.println("c");
        }else if ( a >= 60){
            System.out.println("D");
        }else{
            System.out.println("f");

            for(int i = 1; i <= 6; i++){
                System.out.println(i + "번째 출력");
                System.out.println(i+1 + "번째 출력");
            }
        }
    }
}
