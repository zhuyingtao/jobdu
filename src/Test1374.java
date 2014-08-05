import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * @author Z.Y.T
 * 
 *         2014年5月30日 下午11:51:08
 */
public class Test1374 {

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
				int[] array = new int[100];
				for (int i = 0; i < n; i++) {
					st.nextToken();
					int age = (int) st.nval;
					array[age]++;
				}
				StringBuffer sb = new StringBuffer();
				for (int i = 1; i < array.length; i++) {
					if (array[i] != 0) {
						for (int j = 0; j < array[i]; j++) {
							sb.append(i + " ");
						}
					}
				}
				System.out.println(sb.toString());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
