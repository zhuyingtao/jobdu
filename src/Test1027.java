import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author zyt
 * 
 *         2014年8月7日 下午2:35:49
 */
public class Test1027 {

	/**
	 * @param args
	 */
	public static boolean bfs(int[][] matrix) {
		boolean connected = false;
		boolean[] flags = new boolean[matrix.length];
		Queue<Integer> queue = new LinkedList<Integer>();
		int vertex = 0;
		flags[vertex] = true;
		queue.offer(vertex);
		while (!queue.isEmpty()) {
			vertex = queue.poll();
			for (int i = 0; i < matrix.length; i++) {
				if (matrix[vertex][i] != 0 && flags[i] != true) {
					queue.offer(i);
					flags[i] = true;
				}
			}
		}
		for (int i = 0; i < flags.length; i++) {
			if (!flags[i])
				break;
			if (i == flags.length - 1)
				connected = true;
		}
		return connected;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Euler's circuit:
		//1. the graph is connected : BFS.
		//2. all the degrees is even.
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (n == 0)
				break;
			int m = scan.nextInt();
			int[][] matrix = new int[n][n];
			int[] degree=new int[n];
			for (int i = 0; i < m; i++) {
				int a = scan.nextInt() - 1;
				int b = scan.nextInt() - 1;
				matrix[a][b] = 1;
				matrix[b][a] = 1;
				degree[a]++;
				degree[b]++;
			}
			//1. is connected?
			boolean isConnected=bfs(matrix);
			//2. all is even?
			if(isConnected){
				for (int i = 0; i < degree.length; i++) {
					if(degree[i]%2!=0){
						System.out.println(0);
						break;
					}
					if(i==degree.length-1)
						System.out.println(1);
				}
			}else
				System.out.println(0);
		}
		scan.close();
	}
}
