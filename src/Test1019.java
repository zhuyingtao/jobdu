import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1019 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] regx = { "([-]?\\d+[.]?\\d*)([*/])([-]?\\d+[.]?\\d*)", "([-]?\\d+[.]?\\d*)([-+])([-]?\\d+[.]?\\d*)" };
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str = scan.nextLine();
			if (str.equals("0"))
				break;
			str = str.replaceAll(" ", "");
			for (int i = 0; i < regx.length; i++) {
				Pattern pattern = Pattern.compile(regx[i]);
				Matcher m = pattern.matcher(str);
				while (m.find()) {
					double left = Double.parseDouble(m.group(1));
					String op = m.group(2);
					double right = Double.parseDouble(m.group(3));
					double result = 0;
					switch (op) {
					case "*":
						result = left * right;
						break;
					case "/":
						result = left / right;
						break;
					case "-":
						result = left - right;
						break;
					case "+":
						result = left + right;
						break;
					}
					str = str.replace(m.group(), df.format(result));
					// System.out.println(str);
					// if the string changes, the matcher should be reset;
					m.reset(str);
				}
			}
			System.out.println(df.format(Double.parseDouble(str)));
		}
		scan.close();
	}
}
