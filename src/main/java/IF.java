import java.util.Scanner;
public class IF {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("점수를 입력해줘요 : ");
        int a = s.nextInt();


        if (a >= 90){
            System.out.println("A");
        }else if ( a >= 80 ){
            System.out.println("B");
        }else if ( a >= 70 ){
            System.out.println("c");
        }else if ( a >= 60){
            System.out.println("D");
        }else{
            System.out.println("f");
        }
    }
}
