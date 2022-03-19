import java.util.Scanner;     // Scanner를 사용하기 위해서 임포트(자바에 dlc를 꼽는거)
public class Double {
    public static void main(String[] args){

        // 목표 : 이름과 나이를 입력했을때 이름은 같고 나이는 19세 이상이면 구구단을 사용할 수 있게하기. (Scanner사용하기)(if문 사용하기)(for문 사용하기)
        Scanner in = new Scanner(System.in);      // 입력하는 변수 " in " 를 사용하겠다 선언, 후 Scanner를 데이터에 저장하라는 new를 사용   (System.in)은 데이터에 저장하는거
        System.out.print("이름을 입력해주세요 : ");    // 이름을 입력해주세요 출력
        String i = in.nextLine();//  이름 저장받는 변수인  " i " 생성
        String k = "김성현";   // 이 이름과 같은 이름을 입력해야지 구구단이 작동
        System.out.println("나이를 입력해주세요");  // 나이를 입력해주세요 출력
        int j = in.nextInt();  // ※ carmel 표기법으로 중간에 대문자 넣어주기
        // 이름과 나이 저장 완료
        if(k.equals(i)){
            if(j>=19){
                System.out.println("성인입니다");
            }

        } else{
            System.out.println("로그인 실패");
        }

    }
}
