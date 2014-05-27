import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test1041 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			ArrayList<Integer> array = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				int a = scan.nextInt();
				if (i == 0)
					array.add(a);
				for (int j = 0; j < array.size(); j++) {
					if (a == array.get(j))
						break;
					if (j == array.size() - 1)
						array.add(a);
				}
			}
			Collections.sort(array);
			for (int i = 0; i < array.size(); i++) {
				System.out.print(array.get(i)+(i==array.size()-1?"":" "));
			}
			System.out.println();
		}
		scan.close();
	}
}
