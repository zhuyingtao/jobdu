import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

/**
 * @author zyt
 * 
 *         2014年8月17日 下午2:39:30
 */
public class Test1347 {

	static class Edge implements Comparable<Edge> {
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
		int cost = 0;
		// initialize
		int[] belong = new int[number];
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

		for (int i = 0; i < belong.length; i++) {
			if (belong[i] != belong[0]) {
				System.out.println("no");
				return;
			}
		}
		System.out.println(cost);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(
				new InputStreamReader(System.in)));
		try {
			while (st.nextToken() != StreamTokenizer.TT_EOF) {
				int n = (int) st.nval;
				st.nextToken();
				int m = (int) st.nval;
				Edge[] edges = new Edge[m];
				for (int i = 0; i < m; i++) {
					st.nextToken();
					int a = (int) (st.nval - 1);
					st.nextToken();
					int b = (int) (st.nval - 1);
					st.nextToken();
					int w = (int) st.nval;
					edges[i] = new Edge(w, a, b);
				}
				kruskal(edges, n);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
