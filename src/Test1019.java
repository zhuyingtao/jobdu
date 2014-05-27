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
		String[] op = { "[*/]", "[+-]" };
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str = scan.nextLine();
			if (str.equals("0"))
				break;
			for (int i = 0; i < op.length; i++) {
				Pattern pattern = null;
				if (i == 0)
					pattern = Pattern.compile("(\\d+(\\.\\d+)*) " + op[i]
							+ " (\\d+(\\.\\d+)*)");
				else
					pattern = Pattern.compile("(\\-)? (\\d+(\\.\\d+)*) " + op[i]
							+ " (\\d+(\\.\\d+)*)");
				Matcher m = pattern.matcher(str);

				while (m.find()) {
					System.out.println(m.group());
					System.out.println(m.groupCount());
					for (int j = 0; j < m.groupCount(); j++) {
						System.out.println(j + "--" + m.group(j));
					}
					double a = Double.parseDouble(m.group(1).replace(" ", ""));
					double b = Double.parseDouble(m.group(3).replace(" ", ""));
					char c = m.group().charAt(m.group().indexOf(" ") + 1);
					switch (c) {
					case '*':
						a = a * b;
						break;
					case '/':
						a = a / b;
						break;
					case '+':
						a = a + b;
						break;
					case '-':
						a = a - b;
						break;
					default:
						System.out.println("error");
					}
					str = str.replace(m.group(), a + "");
					m.reset(str);
				}
			}
			DecimalFormat df = new DecimalFormat("0.00");
			str = df.format(Double.parseDouble(str));
			System.out.println(str);
		}
		scan.close();
		
	}
}
