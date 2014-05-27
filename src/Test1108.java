import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author Z.Y.T
 * 
 *         2014年4月1日 上午10:33:04
 */
public class Test1108 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			Stack<Integer> stack = new Stack<Integer>();
			for (int i = 0; i < n; i++) {
				String s = scan.next();
				if (s.equals("P")) {
					int m = scan.nextInt();
					stack.push(m);
				} else if (s.equals("O")) {
					try {
						stack.pop();
						// System.out.println(k);
					} catch (EmptyStackException ese) {
					}
				} else if (s.equals("A")) {
					try {
						int k = stack.peek();
						System.out.println(k);
					} catch (EmptyStackException e) {
						// TODO: handle exception
						System.out.println("E");
					}
				}
			}
			System.out.println();
		}
		scan.close();
	}
}
