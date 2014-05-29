import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.LinkedList;

/**
 * @author Z.Y.T
 * 
 *         2014年5月28日 下午9:55:09
 */
public class Test1519 {

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
				LinkedList<Integer> list1 = new LinkedList<Integer>();
				LinkedList<Integer> list2 = new LinkedList<Integer>();
				for (int i = 0; i < n; i++) {
					st.nextToken();
					list1.add((int) st.nval);
				}
				for (int i = 0; i < m; i++) {
					st.nextToken();
					list2.add((int) st.nval);
				}

				LinkedList<Integer> list3 = new LinkedList<Integer>();
				while (!list1.isEmpty() && !list2.isEmpty()) {
					if (list1.peek() <= list2.peek()) {
						list3.add(list1.poll());
					} else {
						list3.add(list2.poll());
					}
				}
				while (!list1.isEmpty())
					list3.add(list1.poll());
				while (!list2.isEmpty())
					list3.add(list2.poll());

				if (list3.size() == 0) {
					System.out.println("NULL");
				} else {
					StringBuffer sb = new StringBuffer();
					for (Integer integer : list3) {
						sb.append(integer + " ");
					}
					System.out.println(sb.deleteCharAt(sb.length() - 1));
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
