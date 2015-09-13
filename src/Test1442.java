import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * @ClassName Test1442
 * @Description TODO
 * @author Zhu Yingtao
 * @date 2015年7月10日 下午5:53:16
 */
public class Test1442 {

	public static long arithmetic(long[] array, int k) {
		long q = array[1] - array[0];
		long result = (array[0] + (k - 1) * q) % 200907;
		return result;
	}

	// quick power
	public static long geometric(long[] array, int k) {
		long q = array[1] / array[0];
		long result = 1;
		int m = k - 1;
		while (m != 0) {
			if ((m & 1) == 1) {
				result = (result * q) % 200907;
			}
			q = (q * q) % 200907;
			m = m >> 1;
		}
		result = (array[0] * result) % 200907;
		return result;
	}

	public static void compute(long[] array, int k) {
		long result = 0;
		if (array[1] - array[0] == (array[2] - array[1]))
			// arithmetic sequence;
			result = arithmetic(array, k);
		else
			// geometric sequence;
			result = geometric(array, k);
		System.out.println(result);
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
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			for (int j = 0; j < n; j++) {
				long[] array = new long[3];
				for (int i = 0; i < array.length; i++) {
					st.nextToken();
					array[i] = (long) st.nval;
				}
				st.nextToken();
				int k = (int) st.nval;
				compute(array, k);
			}
		}
	}
}
