import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName Test1103
 * @Description TODO
 * @author Zhu Yingtao
 * @date 2015年6月30日 下午11:00:50
 */
public class Test1103 {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] regx = { "([+-]?)(\\d*)(x\\^2)", "([+-]?)(\\d*)x", "([+-]?)(\\d+)" };

		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int[] var = { 0, 0, 0 };
			String str = scan.nextLine().replaceAll("\\s+", "");
			for (int i = 0; i < regx.length; i++) {
				Pattern p = Pattern.compile(regx[i]);
				Matcher m = p.matcher(str);
				while (m.find()) {
					int index = str.indexOf("=");
					String sign = m.group(1); // + or -
					int value = Integer.parseInt(m.group(2).equals("") ? "1" : m.group(2));
					if (m.start() < index) { // in the left of the equal sign;
						if (sign.equals("-"))
							var[i] -= value;
						else
							var[i] += value;
					} else { // in the right of the equal sign;
						if (sign.equals("-"))
							var[i] += value;
						else
							var[i] -= value;
					}
					str = str.replace(m.group(), "");
					// if the string changes, the matcher should be reset;
					m.reset(str);
				}
			}

			double a = var[0], b = var[1], c = var[2];
			double delta = b * b - 4 * a * c;
			if (delta < 0)
				System.out.println("No Solution");
			else {
				double ans1 = (-b + Math.sqrt(delta)) / (2 * a);
				double ans2 = (-b - Math.sqrt(delta)) / (2 * a);
				if (a == 0) {
					ans1 = ans2 = -c;
				}
				// another style
				if (ans1 < ans2)
					System.out.printf("%.2f %.2f\n", ans1, ans2);
				else
					System.out.printf("%.2f %.2f\n", ans2, ans1);
			}
		}
		scan.close();
	}
}
