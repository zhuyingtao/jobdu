import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Zhu Yingtao
 * @ClassName Test1144
 * @Description TODO
 * @date 2015年7月3日 上午11:23:48
 */
public class Test1144 {

    static class Vertex {
        double x;
        double y;

        public Vertex(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double distance(Vertex v) {
            return Math.sqrt(Math.pow(x - v.x, 2) + Math.pow(y - v.y, 2));
        }
    }

    // Prim Algorithm of minimum spanning tree;
    public static String minSpanningTree(double[][] matrix) {
        double value = 0;
        int n = matrix.length;
        // initialize necessary data structure;
        boolean[] visited = new boolean[n];
        ArrayList<Integer> vertexs = new ArrayList<Integer>();
        vertexs.add(0); // choose the vertex 0 as starting;
        visited[0] = true;

        int count = 1;
        while (count < n) {
            // find the minimum edge of all the visited vertex;
            double minEdge = 100;
            int minVertex = -1;
            for (int j = 0; j < vertexs.size(); j++) {
                int base = vertexs.get(j);
                for (int i = 0; i < n; i++) {
                    if (visited[i])
                        continue;
                    if (matrix[base][i] <= minEdge) {
                        minEdge = matrix[base][i];
                        minVertex = i;
                    }
                }
            }
            value += minEdge;
            vertexs.add(minVertex);
            visited[minVertex] = true;
            count++;
        }
        return new DecimalFormat("0.00").format(value);
    }

    /**
     * @param args
     * @Title: main
     * @Description: TODO
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            double[][] distances = new double[n][n];
            // get the input values;
            Vertex[] vertexs = new Vertex[n];
            for (int i = 0; i < n; i++) {
                double a = scan.nextDouble();
                double b = scan.nextDouble();
                vertexs[i] = new Vertex(a, b);
            }
            // calculate the distances
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    distances[i][j] = vertexs[i].distance(vertexs[j]);
                }
            }
            // calculate the minimum costing
            String cost = minSpanningTree(distances);
            System.out.println(cost);
        }
        scan.close();
    }
}
