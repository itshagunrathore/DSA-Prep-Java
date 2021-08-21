package Problems;

import java.util.Arrays;

public class MyString {

    public static int lcs(String s1, String s2, int m, int n, int dp[][]) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (dp[m - 1][n - 1] != -1) {
            return dp[m - 1][n - 1];
        }
        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            dp[m - 1][n - 1] = 1 + lcs(s1, s2, m - 1, n - 1, dp);
            return dp[m - 1][n - 1];
        } else {
            dp[m - 1][n - 1] = Math.max(lcs(s1, s2, m - 1, n, dp), lcs(s1, s2, m, n - 1, dp));
            return dp[m - 1][n - 1];
        }
    }

    public static void main(String[] args) {
        int dp[][] = new int[6][10];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int i = lcs("abcdef", "ahckdlpfjj", 6, 10,dp);
        System.out.println(i);
    }
}
