import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年4月11日 下午5:01:44
 */
class TNode {
	TNode left;
	TNode right;
	char value;
}

public class Test1078 {

	/**
	 * @param args
	 */
	public static TNode getRoot(String pre, String mid) {
		if (pre.length() == 0)
			return null;
		TNode t = new TNode();
		char root = pre.charAt(0);
		int pos = mid.indexOf(root);
		int lengthLeft = pos;

		String preLeft = pre.substring(1, lengthLeft + 1);
		String preRight = pre.substring(lengthLeft + 1);
		String midLeft = mid.substring(0, pos);
		String midRight = mid.substring(pos + 1);

		t.value = root;
		t.left = getRoot(preLeft, midLeft);
		t.right = getRoot(preRight, midRight);
		return t;
	}

	public static void postOrder(TNode t) {
		if (t.left != null)
			postOrder(t.left);
		if (t.right != null)
			postOrder(t.right);
		System.out.print(t.value);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String pre = scan.next();
			String mid = scan.next();
			TNode t = getRoot(pre, mid);
			postOrder(t);
			System.out.println();
		}
		scan.close();
	}
}
