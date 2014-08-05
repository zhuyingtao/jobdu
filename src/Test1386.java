import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * @author Z.Y.T
 * 
 *         2014年5月31日 上午2:03:46
 */
public class Test1386 {

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
				int min = 100000000;
				for (int i = 0; i < n; i++) {
					st.nextToken();
					int m = (int) st.nval;
					if (m < min)
						min = m;
				}
				System.out.println(min);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
