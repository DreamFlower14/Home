import java.util.Scanner;
// 현재 시간 받고 조리시간 받아서 완료 시간 나타내기
public class B2525 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int m = s.nextInt();
        int t = s.nextInt();

        if ((m + t) > 59) {    // 예상시간의 시간 단위가 올라갈 때
            if (h + ((m + t) / 60) < 24) {     // 시간 단위가 올라가도 하루를 넘기지 않을때
                System.out.println((h + (m + t) / 60) + " " + ((m + t) % 60));
            } else {
                System.out.println((h + ((m + t) / 60) - 24) + " " + ((m + t) % 60));
            }
        } else {
            System.out.println(h + " " + (m + t));
        }

        /*
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                int Time =sc.nextInt();
                int min = sc.nextInt();
                int cookTime = sc.nextInt();

                int totalTime = Time*60 + min +cookTime;

                int hour = totalTime/60;

                if(hour >23){
                    hour -=24 ;
                }

                int min2 = totalTime% 60;
                System.out.println(hour+" "+min2);
            }
        }
*/
    }
}