package test;

/**
 * https://blog.csdn.net/qqxyy99/article/details/78861109
 */
public class splitTest {
    public static void main(String[] args) {
        String s = "%a%a%%";
        String[] arr = s.split("%", 0);
        System.out.println(arr.length);
        for (String s1 : arr) {

            System.out.print(s1);
            System.out.print(",");
        }
        System.out.println();
        System.out.println("--------------------------------------");
        String str="a.b.c";
        String[] arr2 = str.split("\\.");
        System.out.println(arr2.length);
        for (String s1 : arr2) {
            System.out.println(s1);
        }
        System.out.println("--------------------------------------");
        String str2="a|b|c";
        String[] arr3 = str2.split("\\|");
        System.out.println(arr3.length);
        for (String s1 : arr3) {
            System.out.println(s1);
        }

    }
}
