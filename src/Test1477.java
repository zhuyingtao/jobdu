import java.util.Scanner;

/**
 * @ClassName Test1477
 * @Description TODO
 * @author Zhu Yingtao
 * @date 2015年7月5日 下午10:31:24
 */
public class Test1477 {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int k = scan.nextInt();
			if (n == 0)
				break;
			StringBuffer sb = new StringBuffer();
			for (int i = 1; i <= n; i++)
				sb.append(i);
			for (int i = 0; i < k; i++) {
				int index = scan.nextInt();
				sb = new StringBuffer(sb.substring(index) + sb.substring(0, index));
				int half = (sb.length() % 2 == 0) ? sb.length() / 2 : (sb.length() - 1) / 2;
				String left = new StringBuffer(sb.substring(0, half)).reverse().toString();
				String right = sb.substring(half);
				sb = new StringBuffer(left + right);
			}

			StringBuffer temp = new StringBuffer();
			for (int i = 0; i < sb.length(); i++) {
				temp.append(sb.charAt(i) + " ");
			}
			System.out.println(temp.toString());
		}
		scan.close();
	}
}
