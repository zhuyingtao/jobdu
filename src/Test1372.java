import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * @ClassName Test1372
 * @Description TODO
 * @author Zhu Yingtao
 * @date 2015年7月10日 下午3:19:43
 */
public class Test1372 {

	public static void maxSum(int[] array) {
		int max = Integer.MIN_VALUE; // the max sum;
		int sum = 0; // the sum right now;
		int maxStart = 0;
		int maxEnd = 0;
		int start = 0;
		int end = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			end = i;
			if (max < sum) {
				max = sum;
				maxEnd = end;
				maxStart = start;
			}
			if (sum < 0) {
				sum = 0;
				start = i + 1;
			}
		}
		System.out.println(max + " " + maxStart + " " + maxEnd);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			if (n == 0)
				break;
			int[] array = new int[n];
			for (int i = 0; i < n; i++) {
				st.nextToken();
				array[i] = (int) st.nval;
			}
			maxSum(array);
		}
	}
}
