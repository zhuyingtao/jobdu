import java.io.IOException;
import java.io.StreamTokenizer;

/**
 * @ClassName Test1402
 * @Description TODO
 * @author Zhu Yingtao
 * @date 2015年7月3日 下午9:57:56
 */
public class Test1402 {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		@SuppressWarnings("deprecation")
		StreamTokenizer st = new StreamTokenizer(System.in);
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			byte[] array = new byte[1000000];
			for (int i = 0; i < n; i++) {
				st.nextToken();
				int m = (int) st.nval;
				array[m]++;
			}

			int count = 0;
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < array.length; i++) {
				if (array[i] == 1) {
					sb.append(i);
					sb.append(" ");
					count++;
				}
			}
			System.out.println(count);
			System.out.println(sb.toString().trim());
		}
	}
}
