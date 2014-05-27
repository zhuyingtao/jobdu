import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年4月13日 下午6:09:08
 */
class Vertex {
	int value;
	Vertex next;
}

public class Test1109 {

	/**
	 * @param args
	 */
	public static boolean bfs(Vertex[] v) {
		Queue<Vertex> queue = new LinkedList<Vertex>();
		queue.add(v[0]);
		int[] visited = new int[v.length];
		while (!queue.isEmpty()) {
			Vertex temp = queue.poll();
			if (visited[temp.value - 1] == 1)
				continue;
			temp = v[temp.value - 1];
			visited[temp.value - 1] = 1;
			while (temp.next != null) {
				queue.add(temp.next);
				temp = temp.next;
			}
		}

		boolean connected = true;
		for (int i = 0; i < visited.length; i++) {
			if (visited[i] == 0) {
				connected = false;
				break;
			}
		}
		return connected;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int vertex = scan.nextInt();
			int edge = scan.nextInt();
			if (vertex == 0)
				break;
			Vertex[] vertexs = new Vertex[vertex];
			for (int i = 0; i < vertexs.length; i++) {
				vertexs[i] = new Vertex();
				vertexs[i].value = i + 1;
			}
			for (int i = 0; i < edge; i++) {
				int start = scan.nextInt();
				int end = scan.nextInt();
				Vertex v = new Vertex();
				v.value = end;
				Vertex temp = vertexs[start - 1];
				while (temp.next != null)
					temp = temp.next;
				temp.next = v;
			}

			boolean connected = bfs(vertexs);
			System.out.println(connected ? "YES" : "NO");
		}
		scan.close();
	}
}
