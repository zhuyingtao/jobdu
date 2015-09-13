import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName Test1444
 * @Description TODO
 * @author Zhu Yingtao
 * @date 2015年7月12日 下午3:43:33
 */
public class Test1444 {

	public static int maxFriends(HashMap<Integer, List<Integer>> map, HashMap<Integer, Boolean> visited) {
		int max = -1;
		for (Integer i : map.keySet()) {
			int result = bfs(map, visited, i);
			if (max < result)
				max = result;
		}
		return max;
	}

	public static int bfs(HashMap<Integer, List<Integer>> map, HashMap<Integer, Boolean> visited, int start) {
		if (visited.get(start) == true)
			return 1;
		int count = 0;
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(start);
		visited.put(start, true);
		while (!queue.isEmpty()) {
			int k = queue.poll();
			count++;
			List<Integer> list = map.get(k);
			for (int i = 0; i < list.size(); i++) {
				int index = list.get(i);
				if (visited.get(index) == false) {
					queue.offer(index);
					visited.put(index, true);
				}
			}
		}
		return count;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StreamTokenizer st = new StreamTokenizer(new InputStreamReader(System.in));
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
			HashMap<Integer, Boolean> visited = new HashMap<Integer, Boolean>();
			for (int i = 0; i < n; i++) {
				st.nextToken();
				int a = (int) st.nval;
				st.nextToken();
				int b = (int) st.nval;

				List l = null;
				if (map.containsKey(a))
					l = map.get(a);
				else
					l = new ArrayList<Integer>();
				l.add(b);
				map.put(a, l);

				if (map.containsKey(b))
					l = map.get(b);
				else
					l = new ArrayList<Integer>();
				l.add(a);
				map.put(b, l);

				if (!visited.containsKey(a))
					visited.put(a, false);
				if (!visited.containsKey(b))
					visited.put(b, false);
			}
			int result = maxFriends(map, visited);
			System.out.println(result);
		}
	}
}
