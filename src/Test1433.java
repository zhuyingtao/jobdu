import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年5月29日 上午1:29:47
 */
class Room implements Comparable<Room> {
	double food;
	double javabean;
	double value;

	public Room(double food, double javabean) {
		// TODO Auto-generated constructor stub
		this.food = food;
		this.javabean = javabean;
		this.value = this.food / this.javabean;
	}

	@Override
	public int compareTo(Room o) {
		// TODO Auto-generated method stub
		return Double.compare(o.value, this.value);
	}

}

public class Test1433 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int m = scan.nextInt();
			int n = scan.nextInt();
			if (m == -1 && n == -1)
				break;
			Room[] rooms = new Room[n];
			for (int i = 0; i < n; i++) {
				Room r = new Room(scan.nextDouble(), scan.nextDouble());
				rooms[i] = r;
			}
			Arrays.sort(rooms);
			double sum = 0;
			for (int i = 0; i < rooms.length && m > 0; i++) {
				Room r = rooms[i];
				if (m > r.javabean) {
					sum += r.food;
					m -= r.javabean;
				} else {
					double percent = m / r.javabean;
					sum += r.food * percent;
					m = 0;
				}
			}
			System.out.println(new DecimalFormat("#.000").format(sum));
		}
		scan.close();
	}
}
