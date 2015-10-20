import java.util.Scanner;

/**
 * @author zyt
 *         <p>
 *         2014年8月13日 下午2:45:38
 */
public class Test1008 {

    public static void dijkstra(int[][] matrix, int[][] matrix2, int s, int e) {
        // initilize
        int[] distances = new int[matrix.length];
        int[] costs = new int[matrix.length];
        for (int i = 0; i < distances.length; i++) {
            distances[i] = Integer.MAX_VALUE;
            costs[i] = 0;
        }
        int[] order = new int[matrix.length];

        // choose the start vertex
        int vertex = s;
        int count = 1;
        distances[vertex] = 0;
        while (count < matrix.length) {
            order[vertex] = count;
            // relax the distances;
            for (int i = 0; i < matrix[vertex].length; i++) {
                if (matrix[vertex][i] == 0)
                    continue;
                int dist = matrix[vertex][i] + distances[vertex];
                if (dist < distances[i]) {
                    distances[i] = dist;
                    costs[i] = matrix2[vertex][i] + costs[vertex];
                }
            }
            // choose next vertex:extract the min i from distances[];
            int min = Integer.MAX_VALUE;
            int pre = vertex;
            for (int i = 0; i < distances.length; i++) {
                if (distances[i] <= min && order[i] == 0) {
                    if (distances[i] == min
                            && matrix2[pre][i] >= matrix2[pre][vertex])
                        continue;
                    vertex = i;
                    min = distances[i];
                }
            }
            count++;
        }
        System.out.println(distances[e] + " " + costs[e]);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            if (n == 0 && m == 0)
                break;
            int[][] lengths = new int[n][n];
            int[][] costs = new int[n][n];

            for (int i = 0; i < m; i++) {
                int s = scan.nextInt() - 1;
                int e = scan.nextInt() - 1;
                int l = scan.nextInt();
                int v = scan.nextInt();
                lengths[s][e] = l;
                lengths[e][s] = l;
                costs[s][e] = v;
                costs[s][e] = v;
            }

            int start = scan.nextInt() - 1;
            int end = scan.nextInt() - 1;
            dijkstra(lengths, costs, start, end);
        }
    }
}
