import java.util.Scanner;

/**
 * @ClassName Test1448
 * @Description TODO
 * @author Zhu Yingtao
 * @date 2015年7月12日 上午11:25:53
 */
public class Test1448 {

	public static boolean topoSort(int[][] map) {
		int n = map.length;
		int[] indegree = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] == 1)
					indegree[j]++;
			}
		}

		for (int i = 0; i < n; i++) {
			int k = n;
			// find the vertex that indegree = 0 ;
			for (int j = 0; j < indegree.length; j++) {
				if (indegree[j] == 0) {
					indegree[j]--; // not find again;
					k = j;
					break;
				}
			}
			if (k == n) // no indegree = 0;
				return false;
			// relax the related vertex;
			for (int j = 0; j < n; j++) {
				if (map[k][j] == 1)
					indegree[j]--;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			if (n == 0)
				break;
			int[][] map = new int[n][n];
			for (int i = 0; i < m; i++) {
				int x = scan.nextInt();
				int y = scan.nextInt();
				map[x][y] = 1;
			}
			boolean succ = topoSort(map);
			if (succ)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		scan.close();
	}
}
