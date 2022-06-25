package Home;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
public class H0621_2 {

    public static void main(String[] args){
        List<Map<String,String>> plist = new ArrayList<>();
        Map<String,String> map = new HashMap<>();

        map.put("name","이협건");
        map.put("dept","데이터분석");

        plist.add(map);
        map = null;

        map = new HashMap<>();

        map.put("name","홍길동");
        map.put("dept","정보보안");

        plist.add(map);

        for (Map<String, String> stringStringMap : plist){
            System.out.println(stringStringMap.get(" "));
        }
    }
}
