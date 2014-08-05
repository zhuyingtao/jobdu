import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * @author Z.Y.T
 * 
 *         2014年5月31日 下午3:41:49
 */
public class Test1349 {

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
				int[] times = new int[1000000];
				for (int i = 0; i < n; i++) {
					st.nextToken();
					int m = (int) st.nval;
					times[m]++;
				}
				st.nextToken();
				int s = (int) st.nval;
				for (int i = 0; i < s; i++) {
					st.nextToken();
					int j = (int) st.nval;
					System.out.println(times[j]);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
