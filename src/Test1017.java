import java.util.Scanner;

/**
 * @author zyt
 * 
 *         2014年6月22日 下午3:18:25
 */
public class Test1017 {

	/**
	 * @param args
	 */
	public static int Prim(int[][] array) {
		int length = 0;
		boolean[] visited = new boolean[array.length];
		visited[0] = true;
		int count = 1;
		while (count != visited.length) {
			int next = 0;
			int minValue = 999;
			// find the min edge of the visited set.
			for (int i = 0; i < visited.length; i++) {
				if (!visited[i])
					continue;
				for (int j = 0; j < array.length; j++) {
					if (!visited[j] && array[i][j] != 0
							&& array[i][j] < minValue) {
						minValue = array[i][j];
						next = j;
					}
				}
			}
			// add the new vertex into the visited set.
			visited[next] = true;
			length += minValue;
			count++;
		}
		return length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (n == 0)
				break;
			int[][] values = new int[n][n];
			int m = n * (n - 1) / 2;
			for (int i = 0; i < m; i++) {
				int a = scan.nextInt() - 1;
				int b = scan.nextInt() - 1;
				int v = scan.nextInt();
				values[a][b] = v;
				values[b][a] = v;
			}
			System.out.println(Prim(values));
		}
		scan.close();
	}

}
