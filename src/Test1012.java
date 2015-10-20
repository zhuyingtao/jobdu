import java.io.BufferedInputStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author zyt
 *         <p>
 *         2014年8月15日 下午2:53:54
 */
public class Test1012 {

    public static void bfs(int[][] matrix, int[] visited, int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = 1;
        while (!queue.isEmpty()) {
            int v = queue.poll();
            for (int i = 0; i < matrix[v].length; i++) {
                if (matrix[v][i] != 0 && visited[i] == 0) {
                    queue.offer(i);
                    visited[i] = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(new BufferedInputStream(System.in));
        while (scan.hasNext()) {
            int n = scan.nextInt();
            if (n == 0)
                break;
            int m = scan.nextInt();
            int[][] matrix = new int[n][n];
            for (int i = 0; i < m; i++) {
                int a = scan.nextInt() - 1;
                int b = scan.nextInt() - 1;
                matrix[a][b] = 1;
                matrix[b][a] = 1;
            }
            int[] visited = new int[n];
            int count = 0; // the number of connected component
            for (int i = 0; i < n; i++) {
                if (visited[i] == 0) {
                    bfs(matrix, visited, i);
                    count++;
                }
            }
            System.out.println(count - 1);
        }
    }
}
