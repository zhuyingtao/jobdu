import java.math.BigDecimal;
import java.util.Scanner;

public class Test1080 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String in = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String out = "0123456789abcdefghijklmnopqrstuvwxyz";
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int m = scan.nextInt();
			int n = scan.nextInt();
			String s = scan.next();
			if (s.equals("0")) {
				System.out.println("0");
			} else {
				StringBuffer sb = new StringBuffer(s).reverse();
				BigDecimal bi = new BigDecimal(0);
				for (int i = 0; i < sb.length(); i++) {
					char ch = sb.charAt(i);
					int k = in.indexOf(ch);
					bi = bi.add(new BigDecimal(k * Math.pow(m, i)));
				}
				StringBuffer result = new StringBuffer();
				while (bi.compareTo(new BigDecimal(0)) != 0) {
					BigDecimal temp = bi.remainder(new BigDecimal(n));
					char ch = out.charAt(temp.intValue());
					result = result.insert(0, ch);
					bi = bi.divideToIntegralValue(new BigDecimal(n));
				}
				System.out.println(result);
			}
		}
		scan.close();
	}
}
