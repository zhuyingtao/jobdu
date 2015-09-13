import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * 
 */

/**
 * @author zyt
 * 
 */
public class Test1391 {

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
				st.nextToken();
				int m = (int) st.nval;
				int[][] matrix = new int[n][m];
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < m; j++) {
						st.nextToken();
						matrix[i][j] = (int) st.nval;
					}
				}
				int top = 0, down = n - 1, left = 0, right = m - 1;
				int i = 0, j = 0;
				StringBuffer sb = new StringBuffer();
				while (top <= down || left <= right) {
					for (; j < right; j++)
						sb.append(matrix[i][j] + " ");
					top++;
					for (; i < down; i++)
						sb.append(matrix[i][j] + " ");
					right--;
					for (; j > left; j--)
						sb.append(matrix[i][j] + " ");
					down--;
					for (; i > top; i--)
						sb.append(matrix[i][j] + " ");
					left++;
				}
				sb.append(matrix[i][j]+" ");
				System.out.println(sb);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
