import java.util.Calendar;
import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 */
class Node {
	int value;
	Node next;
}

public class Test1518 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (n == 0) {
				System.out.println("NULL");
			} else {
				// int[] ll = new int[n];
				// for (int i = 0; i < n; i++) {
				// ll[i] = scan.nextInt();
				// }
				//
				// StringBuffer s = new StringBuffer();
				//
				// for (int i = ll.length - 1; i >= 0; i--) {
				// if (i == 0)
				// s.append(ll[i]);
				// else
				// s.append(ll[i] + " ");
				// }
				// System.out.println(s);
				Node head = null;
				for (int i = 0; i < n; i++) {
					Node node = new Node();
					node.value = scan.nextInt();
					if (i == 0)
						head = node;
				}
			}
		}
		scan.close();
	}
}
