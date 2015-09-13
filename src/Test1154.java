import java.util.Scanner;

/**
 * @ClassName Test1154
 * @Description TODO
 * @author Zhu Yingtao
 * @date 2015年7月3日 下午3:54:55
 */
public class Test1154 {

	// Prim Algorithm of minimum spanning tree;
	public static int minSpanningTree(int[][] matrix) {
		int value = 0;
		int n = matrix.length;
		// initialize
		boolean[] visited = new boolean[n];
		visited[0] = true;
		int count = 1;

		while (count < n) {
			int minEdge = 100;
			int minVertex = -1;
			for (int i = 0; i < n; i++) {
				// find minimum edge from all the visited vertex;
				if (visited[i]) {
					for (int j = 0; j < n; j++) {
						if (visited[j])
							continue;
						if (matrix[i][j] != 0 && matrix[i][j] <= minEdge) {
							minEdge = matrix[i][j];
							minVertex = j;
						}
					}
				}
			}
			value += minEdge;
			visited[minVertex] = true;
			count++;
		}
		return value;
	}

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (n == 0)
				break;
			int[][] distances = new int[n][n];
			for (int i = 0; i < n - 1; i++) {
				char baseVil = scan.next().charAt(0);
				int m = scan.nextInt();
				for (int j = 0; j < m; j++) {
					char nextVil = scan.next().charAt(0);
					distances[baseVil - 'A'][nextVil - 'A'] = distances[nextVil - 'A'][baseVil - 'A'] = scan.nextInt();
				}
			}
			System.out.println(minSpanningTree(distances));
		}
		scan.close();
	}
}
