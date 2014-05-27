import java.util.Scanner;

public class Test1163 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			boolean flag = true;
			StringBuffer sb = new StringBuffer();
			for (int i = 2; i < n; i++) {
				if (("" + i).endsWith("1")) {
					for (int j = 2; j < i; j++) {
						if (i % j == 0)
							break;
						if (j == i - 1) {
							sb.append((flag ? "" : " ") + i);
							flag = false;
						}
					}
				}
			}
			if (flag) {
				System.out.println("-1");
			} else {
				System.out.println(sb);
			}
		}
		scan.close();
	}
}
