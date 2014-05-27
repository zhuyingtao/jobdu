import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

/**
 * @author Z.Y.T
 * 
 *         2014年4月7日 上午1:03:09
 */
public class Test1371 {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Scanner scan = new Scanner(System.in);
		// while (scan.hasNext()) {
		// int n = scan.nextInt();
		// int k = scan.nextInt();
		// long[] array = new long[n];
		// for (int i = 0; i < n; i++) {
		// array[i] = scan.nextLong();
		// }
		// Arrays.sort(array);
		// StringBuffer sb = new StringBuffer();
		// for (int i = 0; i < k; i++) {
		// sb.append(array[i] + " ");
		// }
		// System.out.println(sb.toString().trim());
		// }
		// scan.close();

		StreamTokenizer st = new StreamTokenizer(new BufferedReader(
				new InputStreamReader(System.in)));
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			st.nextToken();
			int k = (int) st.nval;
			long[] array = new long[n];
			for (int i = 0; i < n; i++) {
				st.nextToken();
				array[i] = (long) st.nval;
			}
			Arrays.sort(array);
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < k; i++) {
				sb.append(array[i] + " ");
			}
			System.out.println(sb.toString().trim());
		}

	}
}
