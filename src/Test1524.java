import java.util.Scanner;

/**
 * @ClassName Test1524
 * @Description TODO
 * @author Zhu Yingtao
 * @date 2015年7月5日 下午9:19:41
 */
public class Test1524 {

	static class Node {
		int value;
		Node other;

		public Node(int value) {
			this.value = value;
		}

		public void linkOther(Node other) {
			this.other = other;
		}

		public String toString() {
			// TODO Auto-generated method stub
			return this.value + " " + (other == null ? 0 : other.value);
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
			int n = scan.nextInt();
			Node[] nodes = new Node[n];
			for (int i = 0; i < n; i++) {
				Node node = new Node(scan.nextInt());
				nodes[i] = node;
			}
			for (int i = 0; i < n; i++) {
				int index = scan.nextInt();
				if (index == 0)
					continue;
				else
					nodes[i].linkOther(nodes[index - 1]);
			}
			for (Node node : nodes) {
				System.out.println(node);
			}
		}
		scan.close();
	}
}
