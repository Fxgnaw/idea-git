import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>(/*new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        }*/);
        map.put("a", "aa");
        map.put("b", "bb");
        map.put("c", "cc");
        Set<String> strings = map.keySet();
        for (String string : strings) {
            System.out.println(string);
        }

    }
}
