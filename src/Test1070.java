import java.util.Scanner;

public class Test1070 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int y = scan.nextInt();
			int m = scan.nextInt();
			int d = scan.nextInt();
			int day = 0;
			for (int i = 0; i < m - 1; i++) {
				day += monthDays[i];
			}
			day += d;
			if ((y % 100 == 0 && y % 400 == 0) || (y % 100 != 0 && y % 4 == 0)) {
				if (m > 2)
					day += 1;
			}
			System.out.println(day);
		}
		scan.close();
	}
}
