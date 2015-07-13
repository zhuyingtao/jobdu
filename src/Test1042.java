import java.util.Scanner;

/**
 * @ClassName Test1042
 * @Description TODO
 * @author Zhu Yingtao
 * @date 2015年7月7日 上午12:03:21
 */
public class Test1042 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String a = scan.next();
			String b = scan.next();
			int n = a.length();
			int m = b.length();
			int[][] dp = new int[n + 1][m + 1];
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= m; j++) {
					if (a.charAt(i - 1) == b.charAt(j - 1))
						dp[i][j] = dp[i - 1][j - 1] + 1;
					else if (dp[i - 1][j] >= dp[i][j - 1])
						dp[i][j] = dp[i - 1][j];
					else
						dp[i][j] = dp[i][j - 1];
				}
			}
			System.out.println(dp[n][m]);
		}
		scan.close();
	}
}
