import java.util.Scanner;

public class Home0421 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long a = s.nextInt();
        long b = s.nextInt();
        long c = s.nextInt();
        long d = s.nextInt();


        for(long i = 0; i < d-1; i++){
            a = a * b + c;
        }
        System.out.println(a);
    }
}
