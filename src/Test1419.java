import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年5月30日 上午12:59:02
 */
class MyString1 implements Comparable<MyString1> {
	String str;

	public MyString1(String str) {
		// TODO Auto-generated constructor stub
		this.str = str;
	}

	@Override
	public int compareTo(MyString1 o) {
		// TODO Auto-generated method stub
		return str.compareToIgnoreCase(o.str);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.str;
	}
}

public class Test1419 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = Integer.parseInt(scan.nextLine());
			MyString1[] s = new MyString1[n];
			for (int i = 0; i < n; i++) {
				s[i] = new MyString1(scan.nextLine());
			}
			Arrays.sort(s);
			for (MyString1 myString1 : s) {
				System.out.println(myString1);
			}
		}
		scan.close();
	}
}
