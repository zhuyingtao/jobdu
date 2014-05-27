import java.util.Arrays;
import java.util.Scanner;

class MyString implements Comparable<MyString> {

	String s;

	public MyString(String s) {
		this.s = s;
	}

	@Override
	public int compareTo(MyString o) {
		// TODO Auto-generated method stub
		if (s.length() < o.s.length())
			return -1;
		if (s.length() > o.s.length())
			return 1;
		return 0;
	}
}

public class Test1135 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			scan.nextLine();
			MyString[] temp = new MyString[n];
			int j = 0;
			for (int i = 0; i < temp.length; i++) {
				String s = scan.nextLine();
				if (s.equals("stop"))
					break;
				temp[i] = new MyString(s);
				j++;
			}
			Arrays.sort(temp, 0, j);

			for (int i = 0; i < j; i++) {
				System.out.println(temp[i].s);
			}
		}
		scan.close();
	}
}
