import java.util.Scanner;  // import (삽입)  java.util.Scanner(변수)
// 자바에는 Sca

public class T {
    public static void main(String[] args){
         // 구구단 만들기 (정수형 변수3개)(1,2단 구구단)(연산에 사용되는 변수는 0으로 초기화)(증감 연산자와 산술 연산자는 반드시 사용)
        int i = 3, j = 4, o = 0; // 정수형 변수 3개 사용  i는 1단, j는 2단으로 사용, o를 연산에 사용
        System.out.print( i + "단\n" );  // 1단 출력 후 줄넘김
        // 1단    1(그대로)(i) x 1(바뀜)(o) = i*o
        System.out.printf("%d x %d = %d\n", i, ++o, i*o);
        System.out.printf("%d x %d = %d\n", i, ++o, i*o);
        System.out.printf("%d x %d = %d\n", i, ++o, i*o);
        System.out.printf("%d x %d = %d\n", i, ++o, i*o);
        System.out.printf("%d x %d = %d\n", i, ++o, i*o);
        System.out.printf("%d x %d = %d\n", i, ++o, i*o);
        System.out.printf("%d x %d = %d\n", i, ++o, i*o);
        System.out.printf("%d x %d = %d\n", i, ++o, i*o);
        System.out.printf("%d x %d = %d\n", i, ++o, i*o);

        Scanner y = new Scanner(System.in); //
        System.out.print("나이 : ");
        int age = y.nextInt(); // 스캐너 변수이름. nextInt()
        if(age>=20){
            System.out.println( age +"살 확인 성인입니다.");
        }
        else{
            System.out.print("%d 살 확인 아직 미성년자입니다.");
        }
    }
}
