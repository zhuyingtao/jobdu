import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * @author Z.Y.T
 * 
 *         2014年5月30日 下午10:44:03
 */
public class Test1384 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(
				new InputStreamReader(System.in)));
		try {
			while (st.nextToken() != StreamTokenizer.TT_EOF) {
				int m = (int) st.nval;
				st.nextToken();
				int n = (int) st.nval;
				st.nextToken();
				int t = (int) st.nval;
				boolean hasFound = false;
				// int[][] array=new int[m][n];
				for (int i = 0; i < m; i++) {
					for (int j = 0; j < n; j++) {
						st.nextToken();
						int k = (int) st.nval;
						if (k == t)
							hasFound = true;
					}
				}
				System.out.println(hasFound ? "Yes" : "No");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
