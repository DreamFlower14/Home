import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("첫 번째 수 : ");
        int a = s.nextInt();
        System.out.print("연산자 : ");
        char b = s.next().charAt(0);
        System.out.print("두 번째 수 : ");
        int c = s.nextInt();

        switch (b) {
            case('+'):
                System.out.println(a + "+" + c + " = " + (a+c)  );
                break;
            case('-'):
                System.out.println(a + "-"+ c + " = " + (a-c)  );
                break;
            case('*'):
                System.out.println(a + "*" + c + " = " + (a*c)  );
                break;
            case('/'):
                System.out.println(a + "/" + c + " = " + (a/c)  );
                break;
            case('%'):
                System.out.println(a + "%%" + c + " = " + (a%c)  );
                break;
        }
    }
}
