import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Z.Y.T
 * 
 *         2014年3月25日 下午11:46:06
 */
public class Test1101 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] op = { "*", "/", "+", "-" };
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str = scan.next();
			// String[] s = str.split("\\d+([+ - * /]\\d+)+");
			// System.out.println(Arrays.toString(s));
			for (int i = 0; i < 4; i++) {
				Pattern p = Pattern.compile("(\\d+)\\" + op[i] + "(\\d+)");
				Matcher m = p.matcher(str);
				while (m.find()) {
					int a = Integer.parseInt(m.group(1));
					int b = Integer.parseInt(m.group(2));
					switch (i) {
					case 0:
						a = a * b;
						break;
					case 1:
						a = a / b;
						break;
					case 2:
						a = a + b;
						break;
					case 3:
						a = a - b;
						break;
					default:
						System.out.println("error");
					}
					str = str.replace(m.group(), a + "");
					m.reset(str);
				}
			}
			System.out.println(str);
		}
		scan.close();
	}
}
