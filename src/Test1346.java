import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年4月7日 上午12:41:01
 */

class VIP implements Comparable<VIP> {
	int id;
	int credit;

	@Override
	public int compareTo(VIP o) {
		// TODO Auto-generated method stub
		if (this.credit < o.credit)
			return 1;
		else if (this.credit > o.credit)
			return -1;
		else if (this.id < o.id)
			return -1;
		else if (this.id > o.id)
			return 1;
		return 0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+"--"+this.credit;
	}

}

public class Test1346 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			VIP[] vips = new VIP[n];
			for (int i = 0; i < n; i++) {
				VIP vip = new VIP();
				vip.id = scan.nextInt();
				vip.credit = scan.nextInt();
				vips[i] = vip;
			}
			Arrays.sort(vips);
			for (int i = 0; i < Math.min(n, m); i++) {
				System.out.println(vips[i].id);
			}
//			System.out.println(Arrays.toString(vips));
		}
		scan.close();
	}
}
