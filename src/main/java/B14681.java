import java.util.Scanner;
public class B14681 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if(a > 0){
            if (b > 0){
                System.out.println("1");
            }else{
                System.out.print("4");
            }
        } else if (b > 0){
            System.out.print("2");
        }else{
            System.out.print("3");
        }
    }
}
