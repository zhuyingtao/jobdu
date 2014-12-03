import java.util.Scanner;

/**
 * @author zyt
 * 
 *         2014年6月22日 下午6:32:49
 */
public class Test1090 {

	public static void print(String s) {
		String[] ss = s.split("\\\\");
		int blank = 0;
		for (int i = 0; i < ss.length; i++) {
			StringBuffer sb = new StringBuffer();
			for (int j = 0; j < blank; j++) {
				sb.append(" ");
			}
			System.out.println(sb.append(ss[i]));
			blank += ss[i].length() + 1;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (n == 0)
				break;
			for (int i = 0; i < n; i++) {
				String s = scan.next();
				print(s);
			}
		}
	}

}
