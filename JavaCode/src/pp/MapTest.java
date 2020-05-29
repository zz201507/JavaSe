package pp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "xiaqiu");
        map.put("2", "pangzi");
        map.put("3", "shouzi");

        Set<String> set = map.keySet();
        Iterator it =  set.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            String name = map.get(obj);
            System.out.println(obj);
            System.out.println(name);
        }
    }
}
