import java.util.Scanner;

public class Test1079 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] locate = { 0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5,
				5, 6, 6, 6, 7, 7, 7, 7 };
		int[] count = { 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3,
				4, 1, 2, 3, 1, 2, 3, 4 };
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str = scan.next();
			char[] temp = str.toCharArray();
			int time = 0;
			int lastLoc = -1;
			for (int i = 0; i < temp.length; i++) {
				int n = temp[i] - 'a';
				if (locate[n] == lastLoc) {
					time += 2;
				}
				time += count[n];
				lastLoc = locate[n];
			}
			System.out.println(time);
		}
		scan.close();
	}
}
