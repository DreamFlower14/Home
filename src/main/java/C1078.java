import java.util.Scanner;
public class C1078 {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int a = s.nextInt();
      int hap = 0;

      for(int i = 1; i <= a; i++) {
          if (i % 2 == 0) {
              hap += i;
          }
      } System.out.println(hap);
    }
}
