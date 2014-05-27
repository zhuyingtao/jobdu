import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年4月15日 上午1:18:24
 */
public class Test1367 {

	/**
	 * @param args
	 */
	public static boolean isPost(int[] array, int start, int end) {
		if (start >= end) // the child tree has only one or null node.
			return true;
		int root = array[end];
		int mid = end;
		for (int i = start; i < end; i++) {
			if (array[i] > root) {
				mid = i;
				break;
			}
		}
		for (int i = mid; i < end; i++) {
			if (array[i] < root) {
				return false;
			}
		}
		boolean left = isPost(array, start, mid - 1);
		boolean right = isPost(array, mid, end - 1);

		return left && right;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int[] array = new int[n];
			for (int i = 0; i < array.length; i++) {
				array[i] = scan.nextInt();
			}
			boolean isPost = isPost(array, 0, n - 1);
			System.out.println(isPost ? "Yes" : "No");
		}
		scan.close();
	}
}
