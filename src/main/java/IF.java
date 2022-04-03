import java.util.Scanner;
public class IF {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("정수를 입력해줘요 : ");
        int a = s.nextInt();


        if (a < 100){
            System.out.println("100보다 작군요");
        }else{
            System.out.println("100과 같거나 크군요");
        }
    }
}
