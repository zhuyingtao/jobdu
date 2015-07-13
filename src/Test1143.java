import java.util.Scanner;

/**
 * @ClassName Test1143
 * @Description TODO
 * @author Zhu Yingtao
 * @date 2015年7月6日 上午11:16:14
 */
public class Test1143 {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String a = scan.next();
			String b = scan.next();
			if (a.equals("0"))
				break;
			int carry = 0;
			for (int i = 0; i < a.length(); i++) {
				int x = a.charAt(i) - '0';
				int y = b.charAt(i) - '0';
				if (x + y >= 10)
					carry++;
			}
			if (carry == 0) {
				System.out.println("NO carry operation.");
			} else if (carry == 1) {
				System.out.println("1 carry operation.");
			} else {
				System.out.println(carry + " carry operations.");
			}
		}
		scan.close();
	}
}
