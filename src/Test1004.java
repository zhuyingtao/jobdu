import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test1004 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			int n = scan.nextInt();
			for (int i = 0; i < n; i++) {
				temp.add(scan.nextInt());
			}
			int m = scan.nextInt();
			for (int i = 0; i < m; i++) {
				temp.add(scan.nextInt());
			}
			Collections.sort(temp);
			int median = (m + n) / 2;
			if ((m + n) % 2 == 0)
				median = median - 1;
			System.out.println(temp.get(median));
		}
		scan.close();
	}
}
