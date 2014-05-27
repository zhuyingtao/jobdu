import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author Z.Y.T
 * 
 */
public class Test1153 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String s = scan.next();
			char[] ss = s.toCharArray();
			char[] result = new char[ss.length];
			Stack<Integer> stack = new Stack<Integer>();
			for (int i = 0; i < ss.length; i++) {
				if (ss[i] == '(') {
					stack.push(i);
				} else if (ss[i] == ')') {
					try {
						stack.pop();
					} catch (EmptyStackException ese) {
						result[i] = '?';
						continue;
					}
				}
				result[i] = ' ';
			}
			while (!stack.isEmpty()) {
				int i = stack.pop();
				result[i] = '$';
			}
			String r = new String(result);
			System.out.println(s);
			System.out.println(r);
		}
		scan.close();
	}
}
