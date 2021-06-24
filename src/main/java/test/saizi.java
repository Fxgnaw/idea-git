package test;

public class saizi {

    public static void main(String[] args) {
        for (double v : tt(2)) {
            System.out.println(v);
        }
    }

    public static double[] tt(int n) {
        int[][] res = new int[n + 1][6 * n + 1];
        for (int i = 1; i <= 6; i++) {
            res[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = i; j <= 6 * i; j++) {
                for (int k = 1; k <= 6; k++) {
                    if (j - k >= 0) {
                        res[i][j] += res[i - 1][j - k];
                    }
                }
            }
        }
        double[] dou = new double[6 * n - n + 1];
        for (int i = 0; i < dou.length; i++) {
            dou[i] = (double) res[n][i + n] / Math.pow(6, n);
        }
        return dou;
    }
}
