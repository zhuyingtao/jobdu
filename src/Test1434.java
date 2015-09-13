import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName Test1434
 * @Description TODO
 * @author Zhu Yingtao
 * @date 2015年7月12日 上午12:18:05
 */
public class Test1434 {

	static class Recruitments implements Comparable<Recruitments> {
		int start;
		int end;

		public Recruitments(int start, int end) {
			// TODO Auto-generated constructor stub
			this.start = start;
			this.end = end;
		}

		@Override
		public int compareTo(Recruitments o) {
			// TODO Auto-generated method stub
			if (this.end < o.end)
				return -1;
			if (this.end == o.end)
				return 0;
			else
				return 1;
		}

	}

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (n == 0)
				break;
			Recruitments[] array = new Recruitments[n];
			for (int i = 0; i < n; i++) {
				int s = scan.nextInt();
				int e = scan.nextInt();
				array[i] = new Recruitments(s, e);
			}
			Arrays.sort(array);
			int count = 1;
			int end = array[0].end;
			for (int i = 1; i < array.length; i++) {
				if (array[i].start >= end) {
					count++;
					end = array[i].end;
				}
			}
			System.out.println(count);
		}
		scan.close();
	}
}
