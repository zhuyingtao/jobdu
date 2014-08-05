import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * @author Z.Y.T
 * 
 *         2014年5月31日 下午4:45:41
 */
class MyArray {
	int[] array;

	public MyArray(int[] array) {
		// TODO Auto-generated constructor stub
		this.array = array;
	}

	public void add(int l, int r, int w) {
		if (l > r) {
			for (int i = 0; i <= r; i++) {
				array[i] += w;
			}
			for (int i = l; i < array.length; i++) {
				array[i] += w;
			}
		} else {
			for (int i = l; i <= r; i++) {
				array[i] += w;
			}
		}
	}

	public void min(int l, int r) {
		int min = Integer.MAX_VALUE;
		if (l > r) {
			for (int i = 0; i <= r; i++) {
				if (min > array[i])
					min = array[i];
			}
			for (int i = l; i < array.length; i++) {
				if (min > array[i])
					min = array[i];
			}
		} else {
			for (int i = l; i <= r; i++) {
				if (min > array[i])
					min = array[i];
			}
		}
		System.out.println(min);
	}
}

public class Test1407 {

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
				int[] temp = new int[n];
				for (int i = 0; i < n; i++) {
					st.nextToken();
					temp[i] = (int) st.nval;
				}
				MyArray ma = new MyArray(temp);

				st.nextToken();
				int m = (int) st.nval;
				st.eolIsSignificant(true);
				st.nextToken();
				for (int i = 0; i < m; i++) {
					int count = 0;
					int[] op = new int[3];
					while (st.nextToken() != StreamTokenizer.TT_EOL) {
						op[count] = (int) st.nval;
						count++;
					}
					if (count == 3) {
						ma.add(op[0], op[1], op[2]);
					} else if (count == 2) {
						ma.min(op[0], op[1]);
					} else {
						System.out.println("Error : count");
					}
				}
				st.eolIsSignificant(false);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
