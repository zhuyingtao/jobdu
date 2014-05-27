import java.util.Arrays;
import java.util.Scanner;

public class Test1066 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		StringBuffer sb=new StringBuffer();
		while (scan.hasNext()) {
			String str = scan.nextLine();
			char[] ch = str.toCharArray();
			Arrays.sort(ch);
			sb.append(ch);
			sb.append("\n");
		}
		System.out.println(sb);
		scan.close();
	}
}
