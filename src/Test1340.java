import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年6月1日 下午9:23:15
 */
public class Test1340 {

	/**
	 * @param args
	 */
	public static char[] compute(char[] a, char[] b) {
		int la = a.length;
		int lb = b.length;
		char[] temp = new char[la > lb ? la : lb];
		int flag = 0;
		for (int i = 0; i < temp.length; i++) {
			char aa, bb;
			if (i >= la)
				aa = 'a';
			else
				aa = a[i];
			if (i >= lb)
				bb = 'a';
			else
				bb = b[i];

			char c = (char) (aa + bb - 'a' + flag);
			if (c > 'z') {
				flag = 1;
				c = (char) (c - 26);
			} else {
				flag = 0;
			}
			temp[i] = c;
		}
		if (flag == 1) {
			char[] ntemp = new char[temp.length + 1];
			for (int i = 0; i < temp.length; i++) {
				ntemp[i] = temp[i];
			}
			ntemp[ntemp.length - 1] = 'b';
			temp = ntemp;
		}

		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			String s1 = new StringBuffer(scan.next()).reverse().toString();
			String s2 = new StringBuffer(scan.next()).reverse().toString();
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			char[] c3 = compute(c1, c2);
			String s3 = new StringBuffer(new String(c3)).reverse().toString()
					.replaceFirst("^a+", "");
			System.out.println(s3.length() == 0 ? "a" : s3);
		}

		scan.close();
	}
}
