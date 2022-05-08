import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Home0507 {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        int ls = li.size();


        for (int i = 0; i < 11; i++) {
            if(ls < 11) {
                String a = s.nextLine();
                li.add(a);
            }
        }
        System.out.println(ls);
        System.out.println(li.get(0));
        for(int j = 0; j < ls; j++){
            System.out.println("문자 : "+li.get(j));
            System.out.println("?");
        }
    }
}
