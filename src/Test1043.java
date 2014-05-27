import java.util.Scanner;

public class Test1043 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] months = { "January", "February", "March", "April", "May",
				"June", "July", "August", "September", "October", "November",
				"December" };
		String[] week = { "Sunday", "Monday", "Tuesday", "Wednesday",
				"Thursday", "Friday", "Saturday" };
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int d = scan.nextInt();
			String month = scan.next();
			int y = scan.nextInt();

			int m = 0;
			for (int i = 0; i < months.length; i++) {
				if (month.equals(months[i])) {
					m = i + 1;
					break;
				}
			}
			if (m == 1 || m == 2) {
				m = m + 12;
				y = y - 1;
			}
			d = d + 1;

			int w = (d + 2 * m + 3 * (m + 1) / 5 + y + y / 4 - y / 100 + y / 400) % 7;
			for (int i = 0; i < week.length; i++) {
				if (w == i) {
					System.out.println(week[i]);
					break;
				}
			}
		}
		scan.close();
	}
}
