public class NineNine {
    public static void main(String[] args) {
        int a = 10;

        a++;  // 단항 연산자 [변수(또는 상수)] 앞에 붙음 , 연산자 우선순위에서 2등
        System.out.printf(" a ++ ==> %d \n", a);  // 계산을 나중에 하기 때문에 후치 증가 연산자라고 부른다

        a--;
        System.out.printf(" a -- ==> %d \n", a);  // 계산을 먼저하기 때문에 선치 증가 연산자라고 부른다

        a +=5;
        System.out.printf(" a += 5 ==> %d \n", a);

        a -= 5;
        System.out.printf(" a -= 5 ==> %d \n", a);

        a *= 5;
        System.out.printf(" a *= 5 ==> %d \n", a);

        a /= 5;
        System.out.printf(" a /= 5 ==> %d \n", a);

        a %= 5;
        System.out.printf(" a %%= 5 ==> %d \n", a); // %는 출력할 땐 한개만 쓰면 안되기 때문에 %%로 써서 표현한다



    }
}
