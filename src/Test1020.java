import java.util.Scanner;

public class Test1020 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (true) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			if (x == 0 && y == 0) {
				scan.close();
				break;
			}
			int xmin = 231;
			int ymin = 231;
			int xmax = -231;
			int ymax = -231;
			while (true) {
				if (x == 0 && y == 0) {
					break;
				}
				if (x < xmin)
					xmin = x;
				if (x > xmax)
					xmax = x;
				if (y < ymin)
					ymin = y;
				if (y > ymax)
					ymax = y;
				x = scan.nextInt();
				y = scan.nextInt();
			}
			System.out.println(xmin + " " + ymin + " " + xmax + " " + ymax);
		}
	}

}
