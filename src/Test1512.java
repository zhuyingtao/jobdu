import java.util.Scanner;
import java.util.Stack;

/**
 * @author Z.Y.T
 * 
 *         2014年5月28日 上午1:12:29
 */
class Queue {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int n) {
		stack1.push(n);
	}

	public int pop() {
		if (stack2.size() == 0) {
			while (stack1.size() != 0)
				stack2.push(stack1.pop());
		}
		try {
			return stack2.pop();
		} catch (Exception e) {
			// TODO: handle exception
			return -1;
		}
	}
}

public class Test1512 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Queue queue = new Queue();
		for (int i = 0; i < n; i++) {
			String str = scan.next();
			if (str.equals("PUSH")) {
				int m = scan.nextInt();
				queue.push(m);
			} else if (str.equals("POP")) {
				System.out.println(queue.pop());
			}
		}
		scan.close();
	}
}
