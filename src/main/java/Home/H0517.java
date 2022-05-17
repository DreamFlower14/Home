package Home;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class H0517 {
    public static void main(String[] args) {
        List<Map<String,String>> list = new ArrayList<>();
        Map<String,String> map = new HashMap<>();

        map.put("이름","김성현");
        map.put("나이","23");
        map.put("주소","인천");

        list.add(map);

        map = null;

        map = new HashMap<>();

        map.put("이름","김다운");
        map.put("나이","24");
        map.put("주소","전주");

        list.add(map);

        map = null;

//        for (int i = 0; i < list.size(); i++) {
//            Map rmap = list.get(i);
//            System.out.println("이름 : " + rmap.get("이름"));
//            System.out.println("나이 : " + rmap.get("나이"));
//            System.out.println("주소 : " + rmap.get("주소"));
//            System.out.println("-------------------------");
//        }
//
//        Iterator<Map<String, String>> it = list.iterator();
//
//        while(it.hasNext()){
//            Map<String,String> rmap = it.next();
//            System.out.println("-------------------------");
//            System.out.println("이름 : " + rmap.get("이름"));
//            System.out.println("나이 : " + rmap.get("나이"));
//            System.out.println("주소 : " + rmap.get("주소"));
//            System.out.println("-------------------------");
//        }
//
//        for(Map<String,String> rmap : list){
//            System.out.println("-------------------------");
//            System.out.println("이름 : " + rmap.get("이름"));
//            System.out.println("나이 : " + rmap.get("나이"));
//            System.out.println("주소 : " + rmap.get("주소"));
//            System.out.println("-------------------------");
//        }

        list.forEach( rmap -> {
                System.out.println("-------------------------");
                System.out.println("이름 : " + rmap.get("이름"));
                System.out.println("나이 : " + rmap.get("나이"));
                System.out.println("주소 : " + rmap.get("주소"));
                System.out.println("-------------------------"); } );
    }
}
