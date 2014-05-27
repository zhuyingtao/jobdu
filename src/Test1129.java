import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年4月6日 下午2:46:39
 */
public class Test1129 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String s = scan.next();
			if (s.equals("0"))
				break;
			long sum = 0;
			for (int i = 0; i < s.length(); i++) {
				int num = s.charAt(i) - '0';
				int bit = s.length() - i;
				long value = num * (long) (Math.pow(2, bit) - 1);
				sum += value;
			}
			System.out.println(sum);
		}
		scan.close();
	}
}
