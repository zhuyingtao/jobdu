import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author zyt
 * 
 *         2014��8��15�� ����3:45:25
 */
public class Test1022 {

	public static class Log {
		int number;
		int state;
		int time;

		public Log(int number, String state, String time) {
			// TODO Auto-generated constructor stub
			this.number = number;
			if (state.equals("E"))
				this.state = 1;
			String[] ss = time.split(":");
			this.time = Integer.parseInt(ss[0]) * 60 + Integer.parseInt(ss[1]);
		}
	}

	public static void compute(ArrayList<Log> array) {
		int sumTime = 0;
		int count = 0;
		while (!array.isEmpty()) {
			Log log = array.get(0);
			if (log.state == 1) // there is no start.
				array.remove(log);
			else {
				int n = log.number;
				for (int j = 1; j < array.size(); j++) {
					if (array.get(j).number == n) {
						if (array.get(j).state == 0) { // there is no end.
						} else { // this is correct log.
							Log log2 = array.get(j);
							sumTime += log2.time - log.time;
							array.remove(log2);
							count++;
						}
						break;
					}
				}
				array.remove(log);
			}
		}
		long aveTime = Math.round((double) sumTime / count);
		System.out.println(count + " " + aveTime);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(new BufferedInputStream(System.in));
		ArrayList<Log> array = new ArrayList<Log>();
		int n = scan.nextInt();
		while (n != -1) {
			String state = scan.next();
			String time = scan.next();
			if (n == 0)
				compute(array);
			else {
				Log log = new Log(n, state, time);
				array.add(log);
			}
			n = scan.nextInt();
		}
	}

}
