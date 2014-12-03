import java.util.Scanner;

/**
 * @author zyt
 * 
 *         2014年6月19日 下午7:59:44
 */
public class Test1373 {

	public static void compute(int a, int b) {
		int sum = 0;
		for (int i = a; i <= b; i++) {
			String s = Integer.toString(i);
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '1')
					sum++;
			}
		}
		System.out.println(sum);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			if (a <= b)
				compute(a, b);
			else
				compute(b, a);
		}
		scan.close();
	}
}
