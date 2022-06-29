package Home;

import java.util.StringTokenizer;

public class H0629 {
    public static void main(String[] args) {
        String str = "Hello w o r l d";
        StringTokenizer st = new StringTokenizer(str," "); // 문자열, " "안에 어디를 기준으로 자를건지 작성
        StringTokenizer st1 = new StringTokenizer(str); // 기본적으로 스페이스바를 기준으로 나눈다


        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }
    }
}
