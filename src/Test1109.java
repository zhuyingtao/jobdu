import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年4月13日 下午6:09:08
 */
public class Test1109 {

	/**
	 * @param args
	 */
	public static boolean bfs(int[][] matrix) {
		Queue<Integer> queue = new LinkedList<Integer>();
		int[] visited = new int[matrix.length];

		queue.offer(0);
		while (!queue.isEmpty()) {
			int vertex = queue.poll();
			for (int i = 0; i < matrix.length; i++) {
				if (visited[i] == 0 && matrix[vertex][i] == 1) {
					visited[i] = 1;
					queue.offer(i);
				}
			}
		}

		boolean connected = false;
		for (int i = 0; i < visited.length; i++) {
			if (visited[i] == 0)
				break;
			if (i == visited.length - 1)
				connected = true;
		}
		return connected;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			if (n == 0)
				break;
			int[][] matrix = new int[n][n];

			for (int i = 0; i < m; i++) {
				int start = scan.nextInt() - 1;
				int end = scan.nextInt() - 1;
				matrix[start][end] = 1;
				matrix[end][start] = 1;
			}

			boolean connected = bfs(matrix);
			System.out.println(connected ? "YES" : "NO");
		}
		scan.close();
	}
}
