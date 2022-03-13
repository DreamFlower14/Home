public class Home {
    public static void main(String []args){
        int a = 1, b= 2, c = 3;
        System.out.printf(" %d + %d = %d ", a, b, c);
        System.out.println(Math.PI);
        System.out.println(Math.floor(3.9));

        /* int a = 1;
        a = a++; // a = a, a = a + 1
        System.out.println(a);
        a = a; // a = a + 1, a = a
        System.out.println(a);
        a = ++a;
        System.out.println(a); */

        int i = 1;   //정수형 변수 int
        float j = 3.1f;   // 실수형 변수 float 초기화 할 때 뒤에 f를 붙여줘야 한다
        double k = 3.14;  // 실수형 변수 double float 보다 데이터량을 더 잡아먹는다
        System.out.println( i + j );  // 결과는 4,1 실수형으로 나타난다
        System.out.println((int)(i + j));  //  i + j의 값을 정수화 시켜준다
        System.out.println((int)(i + j + k));  // 주의점 (int)를 넣어줄때 정수화시켜주고 싶은 계산식에 괄호()를 넣어줘야한다

        /* Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 표시해 주세요.");
        sc.nextInt();
        System.out.println(); */

        // 구구단 1단부터 9단까지 한번에 나오는 코드 만들기 이중반복문을 사용하면 가능하다.
        // 1 * 1 ~ 9 * 9
        int z, x;
        for(z = 1; z < 10 ; z++){         //   A * B 에서 A 의 반복문 완성
         for( x = 1; x < 10; x++)     //   A * B 에서 B 의 반복문 완성
            { System.out.println(z + " * " + x + " = " + z * x); }
        }
    }

}
