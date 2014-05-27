import java.util.Scanner;

public class Test1094 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String T = scan.next();
			String P = scan.next();
			int count = 0;
			for (int i = 0; i < T.length(); i++) {
				boolean hasNext = T.startsWith(P,i);
				if (hasNext) {
					count++;
				}
			}
			System.out.println(count);
		}
		scan.close();
	}
}
