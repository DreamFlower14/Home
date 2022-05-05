import java.util.ArrayList;
import java.util.List;

public class Home0505 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();

        l.add("1");
        l.add("2");
        l.add("3");
        l.add("4");
        l.add("5");

        int ls = l.size();

        for(int i = 0; i < ls; i++){
            System.out.println("숫자 : "+l.get(i));
        }
    }
}
