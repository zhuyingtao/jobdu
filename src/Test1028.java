import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;


/**
 * @author zyt
 *         <p>
 *         2014年11月27日 下午3:23:02
 */
public class Test1028 {

    static class Edge implements Comparable<Edge> {
        int weight;
        int start;
        int end;
        int state;

        public Edge(int weight, int start, int end, int state) {
            // TODO Auto-generated constructor stub
            this.weight = weight;
            this.start = start;
            this.end = end;
            this.state = state;
        }

        @Override
        public int compareTo(Edge o) {
            // TODO Auto-generated method stub
            if (this.weight < o.weight)
                return -1;
            if (this.weight > o.weight)
                return 1;
            else
                return this.start - o.start;
        }
    }

    public static void kruskal(Edge[] edges, int number) {
        int[] belong = new int[number];
        int cost = 0;
        // initialize
        for (int i = 0; i < belong.length; i++) {
            belong[i] = i;
        }
        for (int i = 0; i < edges.length; i++) {
            Edge edge = edges[i];
            if (edge.state == 1) {
                int start = edge.start;
                int end = edge.end;
                int flag = belong[end];
                for (int j = 0; j < belong.length; j++) {
                    if (belong[j] == flag)
                        belong[j] = belong[start];
                }
            }
        }

        // sort the edges accoding weight.
        Arrays.sort(edges);

        // determine each edge to uinon or not.
        for (int i = 0; i < edges.length; i++) {
            Edge e = edges[i];
            if (e.state == 1)
                continue;
            int start = e.start;
            int end = e.end;
            if (belong[start] != belong[end]) {
                cost += e.weight;
                int flag = belong[end];
                // they union a tree.each node chould change!
                for (int j = 0; j < belong.length; j++) {
                    if (belong[j] == flag)
                        belong[j] = belong[start];
                }
            }
        }
        System.out.println(cost);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(new BufferedInputStream(System.in));
        while (scan.hasNext()) {
            int n = scan.nextInt();
            if (n == 0)
                break;
            int m = n * (n - 1) / 2;
            Edge[] edges = new Edge[m];
            for (int i = 0; i < m; i++) {
                int s = scan.nextInt() - 1;
                int e = scan.nextInt() - 1;
                int w = scan.nextInt();
                int state = scan.nextInt();
                edges[i] = new Edge(w, s, e, state);
            }
            kruskal(edges, n);
        }
        scan.close();
    }
}
