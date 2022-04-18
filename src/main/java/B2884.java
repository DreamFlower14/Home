import java.util.Scanner;
public class B2884 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int m = s.nextInt();
// 입력한 시간보다 45분 빠른 시간 나타내기
        if(h > 0){
            if (m < 45){
                System.out.println((h -1)+" "+ (m+15));
            }else {
                System.out.println(h+" "+ (m-45));
            }
            }else if (h == 0){
            if (m < 45){
                System.out.println("23 " + (m+15));
            }else {
                System.out.println("0 " + (m-45));
            }
        }
    }
}