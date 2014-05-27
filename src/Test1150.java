import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年5月25日 下午9:42:27
 */
public class Test1150 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int[] temp = new int[12];
			String left1 = "";
			String right1 = "";
			String result1 = "";
			for (int j = 0; j < 3; j++) {
				String left = scan.next();
				String right = scan.next();
				String result = scan.next();
				if (result.equals("even")) {
					String s = left + right;
					for (int k = 0; k < s.length(); k++) {
						int m = s.charAt(k) - 'A';
						temp[m] = 1;
					}
				} else if (result.equals("up") || result.equals("down")) {
					left1 = left;
					right1 = right;
					result1 = result;
				}
			}

			String coin = "1";
			String weight = "1";
			for (int j = 0; j < left1.length(); j++) {
				char ch = left1.charAt(j);
				int m = ch - 'A';
				if (temp[m] == 0) {
					coin = ch + "";
					if (result1.equals("up"))
						weight = "heavy";
					else if (result1.equals("down"))
						weight = "light";
					break;
				}
			}

			for (int j = 0; j < right1.length(); j++) {
				char ch = right1.charAt(j);
				int m = ch - 'A';
				if (temp[m] == 0) {
					coin = ch + "";
					if (result1.equals("up"))
						weight = "light";
					else if (result1.equals("down"))
						weight = "heavy";
					break;
				}
			}
			System.out.println(coin + " is the counterfeit coin and it is "
					+ weight + ".");
		}
		scan.close();
	}
}
