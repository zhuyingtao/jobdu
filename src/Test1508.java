import java.util.Scanner;

public class Test1508 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String s = scan.next();
			if (s.matches("[+-]?\\d+")) {
				s = s.replace("+", "");
				System.out.println(s);
			} else {
				System.out.println("My God");
			}
		}
		scan.close();
	}
}
