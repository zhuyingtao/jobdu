import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zyt
 * 
 *         2014年8月15日 下午4:57:33
 */
public class Test1024 {

	public static class Edge implements Comparable<Edge> {
		int weight;
		int start;
		int end;

		public Edge(int weight, int start, int end) {
			// TODO Auto-generated constructor stub
			this.weight = weight;
			this.start = start;
			this.end = end;
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
		// each vertex is a tree.
		for (int i = 0; i < belong.length; i++) {
			belong[i] = i;
		}
		// sort the edges accoding weight.
		Arrays.sort(edges);
		// determine each edge to uinon or not.
		for (int i = 0; i < edges.length; i++) {
			Edge e = edges[i];
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
		// examine they spanning one tree or not.
		for (int i = 0; i < belong.length; i++) {
			if (belong[i] != belong[0]) {
				System.out.println("?");
				break;
			}
			if (i == belong.length - 1) {
				System.out.println(cost);
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(new BufferedInputStream(System.in));
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			if (n == 0)
				break;
			Edge[] edges = new Edge[n];
			for (int i = 0; i < n; i++) {
				int a = scan.nextInt() - 1;
				int b = scan.nextInt() - 1;
				int cost = scan.nextInt();
				Edge e = new Edge(cost, a, b);
				edges[i] = e;
			}
			kruskal(edges, m);
		}
		scan.close();
	}
}
