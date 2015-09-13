import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * @ClassName Test1415
 * @Description TODO
 * @author Zhu Yingtao
 * @date 2015年7月10日 上午9:53:39
 */
public class Test1415 {

	static class CycleQueue {
		int[] data = null;
		int capacity = 0;
		int number = 0; // count the number of the item;
		int head = 0; // point to the head of the queue;
		int tail = 0; // point to the next position of the queue;

		public CycleQueue(int capacity) {
			data = new int[capacity];
			this.capacity = capacity;
		}

		public boolean push(int i) {
			if (number >= capacity)
				return false;
			data[tail] = i;
			tail = (tail + 1) % capacity;
			number++;
			return true;
		}

		public boolean pop() {
			if (number <= 0)
				return false;
			head = (head + 1) % capacity;
			number--;
			return true;
		}

		public int query(int index) {
			if (index > number || index <= 0)
				return -1;
			return data[(head + index - 1) % capacity];
		}

		public boolean isEmpty() {
			return number <= 0;
		}

		public boolean isFull() {
			return number == capacity;
		}
	}

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		StringBuffer sb = new StringBuffer();
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			st.nextToken();
			int m = (int) st.nval;
			CycleQueue cq = new CycleQueue(m);
			for (int i = 0; i < n; i++) {
				st.nextToken();
				String cmd = st.sval;
				int k = -1;
				if (cmd.equals("Push")) {
					st.nextToken();
					k = (int) st.nval;
					boolean succ = cq.push(k);
					if (!succ)
						// System.out.println("failed");
						sb.append("failed\n");
				} else if (cmd.equals("Pop")) {
					boolean succ = cq.pop();
					if (!succ)
						// System.out.println("failed");
						sb.append("failed\n");
				} else if (cmd.equals("Query")) {
					st.nextToken();
					k = (int) st.nval;
					int result = cq.query(k);
					// System.out.println(result == -1 ? "failed" : result);
					sb.append(result == -1 ? "failed\n" : result + "\n");
				} else if (cmd.equals("Isempty")) {
					boolean succ = cq.isEmpty();
					// System.out.println(succ ? "yes" : "no");
					sb.append(succ ? "yes\n" : "no\n");
				} else if (cmd.equals("Isfull")) {
					boolean succ = cq.isFull();
					// System.out.println(succ ? "yes" : "no");
					sb.append(succ ? "yes\n" : "no\n");
				}
			}
			System.out.println(sb.toString());
		}
	}
}
