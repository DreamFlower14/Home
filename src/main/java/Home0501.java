import java.util.Scanner;

public class Home0501 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            System.out.print("몇 번까지 나오게 할껀가여 : ");
            int a = s.nextInt();
            System.out.print("어디서 멈출까?");
            int b = s.nextInt();
            for(int i = 1 ; i <= a; i++){
                System.out.println(i);
            if(i == b){
                break;
            }
        }
    }
}
