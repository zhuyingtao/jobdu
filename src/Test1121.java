import java.util.Scanner;

public class Test1121 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			StringBuffer str = new StringBuffer(scan.nextLine());
			boolean isFirst = true;
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (ch >= 'a' && ch <= 'z' && isFirst) {
					ch = Character.toUpperCase(ch);
					str.setCharAt(i, ch);
					isFirst = false;
				} else if (ch == ' ' || ch == '\t' || ch == '\r' || ch == '\n') {
					isFirst = true;
				} else {    //hello  ,world ²»ÄÜ±ä
					isFirst = false;
				}
			}
			System.out.println(str);
		}
		scan.close();
	}
}
