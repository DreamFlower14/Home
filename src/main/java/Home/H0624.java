package Home;

import java.util.Scanner;

public class H0624 {
    static int a = 10;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int n = s.nextInt();

        hi(str);
        hi(n);

        asd hyd = new asd();
    }

    void hid() {
        System.out.println("안녕");
    }

    static void hi(String hi) {
        System.out.println(hi);
    }

    static void hi(int hi) {
        for (int i = 0; i < hi; i++) {
            System.out.println("hi");
        }
    }
}

class asd extends H0624{

    public String hi() {
        String hi = "dd";
        return hi();
    }

    public static void hi(int b) {   // 오버라이딩 C1419 의 hi(int hi) 를 재정의 해줬다.
        System.out.println(a);
    }
}