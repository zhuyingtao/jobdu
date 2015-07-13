import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Test1516
 * @Description TODO
 * @author Zhu Yingtao
 * @date 2015年7月5日 下午10:01:06
 */
public class Test1516 {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			List<Integer> odd = new ArrayList<Integer>();
			List<Integer> even = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				st.nextToken();
				int val = (int) st.nval;
				if (val % 2 == 0)
					even.add(val);
				else
					odd.add(val);
			}
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < odd.size(); i++) {
				sb.append(odd.get(i) + " ");
			}
			for (int i = 0; i < even.size(); i++) {
				sb.append(even.get(i) + " ");
			}
			System.out.println(sb.toString().trim());
		}
	}
}
