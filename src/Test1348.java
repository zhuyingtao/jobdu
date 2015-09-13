import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * @ClassName Test1348
 * @Description TODO
 * @author Zhu Yingtao
 * @date 2015年7月9日 下午3:31:08
 */
public class Test1348 {

	static long count = 0;

	public static void Merge(int[] array, int s, int m, int e) {
		int[] left = new int[m - s + 1];
		int[] right = new int[e - m];
		for (int i = 0; i < left.length; i++)
			left[i] = array[s + i];
		for (int i = 0; i < right.length; i++)
			right[i] = array[m + 1 + i];

		int i = left.length - 1, j = right.length - 1, k = e;
		while (i >= 0 && j >= 0) { // from end to start as well as reverse;
			if (left[i] > right[j]) {
				array[k--] = left[i--];
				count += (j + 1); // count the inversion number;
			} else {
				array[k--] = right[j--];
			}
		}
		while (i >= 0) {
			array[k--] = left[i--];
		}
		while (j >= 0) {
			array[k--] = right[j--];
		}
	}

	public static void MergeSort(int[] array, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			MergeSort(array, start, mid);
			MergeSort(array, mid + 1, end);
			Merge(array, start, mid, end);
		}
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
			int[] array = new int[n];
			for (int i = 0; i < n; i++) {
				st.nextToken();
				array[i] = (int) st.nval;
			}
			MergeSort(array, 0, array.length - 1);
			// System.out.println(Arrays.toString(array));
			System.out.println(count);
			count = 0;
		}
	}
}
