package test;

import java.util.Arrays;

public class L33 {

    public static boolean verifyPostorder(int[] postorder) {
        if (postorder.length == 0 || postorder.length == 1) return true;
        int divide = postorder[postorder.length - 1];
        int m = 0;
        for (int i = 0; i < postorder.length - 1; i++) {
            if (postorder[i] < divide) {
                m++;
            }
        }
        for (int i = m; i < postorder.length - 1; i++) {
            if (postorder[i] < divide) {
                return false;
            }
        }
        return verifyPostorder(Arrays.copyOfRange(postorder, 0, m)) && verifyPostorder(Arrays.copyOfRange(postorder, m, postorder.length - 1));
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 7, 5};
        System.out.println(verifyPostorder(arr));
    }
}
