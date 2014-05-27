import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年3月26日 下午9:15:15
 */
public class Test1095 {

	/**
	 * @param args
	 */
	public static String transBinary(int n) {
		StringBuffer sb = new StringBuffer();
		while (n != 0) {
			int k = n % 2;
			sb.append(k);
			n = n / 2;
		}
		sb = sb.reverse();
		StringBuffer result = new StringBuffer();
		int l = sb.length() - 1;
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == '1') {
				int k = l - i;
				if (k > 2)
					result.append("2(" + transBinary(k) + ")+");
				else if (k == 1)
					result.append("2+");
				else
					result.append("2(" + k + ")+");
			}
		}
		result = result.deleteCharAt(result.length() - 1);
		return result.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			System.out.println(transBinary(n));
		}
		scan.close();
	}
}
