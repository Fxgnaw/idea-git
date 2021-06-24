import java.util.*;
import java.util.Map;

/**
 * treemap 根据value排序
 */
public class TreeMapValueSort {
    public static void main(String[] args) {
        Map<String,String> map = new TreeMap<String,String>();
        map.put("a", "dddd");
        map.put("d", "aaaa");
        map.put("b", "cccc");
        map.put("c", "bbbb");

        List<Map.Entry<String, String>> list = new ArrayList<>(map.entrySet());

        //升序排序
        Collections.sort(list, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));

        for (Map.Entry<String, String> e: list) {
            System.out.println(e.getKey()+":"+e.getValue());
        }
    }
}
