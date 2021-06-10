public class l1 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        for (int i : constructArr(a)) {
            System.out.println(i);
        }

    }

    public static int[] constructArr(int[] a) {
        int[] pre = new int[a.length];
        pre[0] = 1;
        pre[1] = a[0];
        for (int i = 2; i < a.length; i++) {
            pre[i] = a[i - 1] * pre[i - 1];
        }
        int[] post = new int[a.length];
        post[a.length - 1] = 1;
        post[a.length - 2] = a[a.length - 1];
        for (int i = a.length - 3; i >= 0; i--) {
            post[i] = a[i + 1] * post[i + 1];
        }
        int[] res = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            res[i] = pre[i] * post[i];
        }
        return res;
    }
}
