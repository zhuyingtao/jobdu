import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年5月28日 下午10:11:10
 */

public class Test1525 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {

			int n = Integer.valueOf(scan.nextLine().toString());
			if (n == 0)
				break;

			String result = scan.nextLine();
			String[] str = result.split(" ");

			for (int i = 0; i < str.length; i++) {
				str[i] = str[i].trim();
				if (str[i].equals("")) {
					str[i] = " ";
					continue;
				}
				if (!str[i].equals(" ")) {
					StringBuffer strbf = new StringBuffer(str[i]);
					str[i] = strbf.reverse().toString();
				}
				if (i == 0 || (i == 1 && str[i].equals(" "))) {
					System.out.print(str[i]);
					continue;
				}
				System.out.print(" " + str[i]);
			}
			if ((result.length() >= 2 && result.substring(result.length() - 1,
					result.length()).equals(" "))
					|| str.length == 0)
				System.out.print(" ");
			System.out.println();
		}
		scan.close();
	}
}
