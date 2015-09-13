import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName Test1463
 * @Description TODO
 * @author Zhu Yingtao
 * @date 2015年7月2日 上午10:07:24
 */
public class Test1463 {

	static class Recruitments {
		List<Integer> starts;
		int end;

		public Recruitments(int end) {
			this.end = end;
			starts = new ArrayList<Integer>();
		}

		public void add(int start) {
			starts.add(start);
		}

		public boolean check(int lastEnd) {
			boolean suitable = false;
			for (int i = 0; i < starts.size(); i++) {
				if (starts.get(i) >= lastEnd) {
					suitable = true;
					break;
				}
			}
			return suitable;
		}

		public boolean isEmpty() {
			return starts.isEmpty();
		}
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
			Recruitments[] recruit = new Recruitments[25];
			for (int i = 0; i < recruit.length; i++) {
				recruit[i] = new Recruitments(i);
			}
			int n = scan.nextInt();
			for (int i = 0; i < n; i++) {
				int start = scan.nextInt();
				int end = scan.nextInt();
				recruit[end].add(start);
			}

			int end = 0;
			int count = 0;
			for (int i = 0; i < recruit.length; i++) {
				if (!recruit[i].isEmpty()) {
					end = i;
					count++;
					break;
				}
			}

			for (int i = end + 1; i < recruit.length; i++) {
				if (i < recruit.length && recruit[i].check(end)) {
					end = i;
					count++;
				}
			}
			System.out.println(count);
		}
		scan.close();
	}
}

// import java.io.IOException;
// import java.io.StreamTokenizer;
// import java.util.Arrays;
// import java.util.Comparator;
//
// public class Test1463 {
//
// public static void main(String[] args) throws IOException {
// @SuppressWarnings("deprecation")
// StreamTokenizer st = new StreamTokenizer(System.in);
//
// while (st.nextToken() != StreamTokenizer.TT_EOF) {
// int n = (int) st.nval;
// Node node[] = new Node[n];
// for (int i = 0; i < n; i++) {
// st.nextToken();
// int a = (int) st.nval;
// st.nextToken();
// int b = (int) st.nval;
// node[i] = new Node(a, b);
// }
// Arrays.sort(node, new Comparator<Node>() {
//
// @Override
// public int compare(Node o1, Node o2) {
// // TODO Auto-generated method stub
// return o1.b - o2.b;
// }
// });
// int count = 1, temp = node[0].b;
// for (int i = 1; i < n; i++) {
// if (node[i].a >= temp) {
// count++;
// temp = node[i].b;
// }
// }
// System.out.println(count);
// }
// }
//
// static class Node {
// int a, b;
//
// public Node(int a, int b) {
// this.a = a;
// this.b = b;
// }
// }
// }