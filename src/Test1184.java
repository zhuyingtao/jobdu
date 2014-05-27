import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年4月11日 下午8:10:00
 */
class _Node {
	_Node left;
	_Node right;
	char value;
}

public class Test1184 {

	/**
	 * @param args
	 */
	public static String s;

	public static _Node makeTree() {
		char value = s.charAt(0);
		s = s.substring(1);
		if (value == '#')
			return null;
		_Node n = new _Node();
		n.value = value;
		n.left = makeTree();
		n.right = makeTree();
		return n;
	}

	public static void inOrder(_Node n) {
		if (n.left != null)
			inOrder(n.left);
		System.out.print(n.value+" ");
		if (n.right != null)
			inOrder(n.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			s = scan.next();
			_Node n = makeTree();
			inOrder(n);
			System.out.println();
		}
		scan.close();
	}

}
