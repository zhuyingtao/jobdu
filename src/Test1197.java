import java.util.Scanner;

public class Test1197 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str = scan.next();
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				int count = Integer.bitCount(ch);
				String s = Integer.toBinaryString((int) ch);
				if (s.matches("\\d{6}")) {
					s = "0" + s;
				}
				if (count % 2 == 0) {
					s = "1" + s;
				} else {
					s = "0" + s;
				}
				System.out.println(s);
			}
		}
		scan.close();
	}
}
