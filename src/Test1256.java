import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * @author Z.Y.T
 * 
 *         2014年4月3日 下午7:48:54
 */
public class Test1256 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner scan = new Scanner(System.in);
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(
				new InputStreamReader(System.in)));
		try {
			while (st.nextToken() != StreamTokenizer.TT_EOF) {
				int n = (int) st.nval;
				int[] array = new int[n];
				boolean[] flag = new boolean[n];
				for (int i = 0; i < n; i++) {
					st.nextToken();
					array[i] = (int) st.nval;
					flag[i] = false;
				}

				for (int i = 0; i < n; i++) {
					if (!flag[i]) {
						for (int j = i + 1; j < n; j++) {
							if (array[i] == array[j]) {
								flag[i] = true;
								flag[j] = true;
								break;
							}
						}
					}
				}
				int a = -111;
				int b = -111;
				for (int i = 0; i < n; i++) {
					if (!flag[i]) {
						if (a == -111)
							a = array[i];
						else
							b = array[i];
					}
				}
				System.out.println(a > b ? (b + " " + a) : (a + " " + b));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
