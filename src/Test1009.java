import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年4月14日 下午3:59:11
 */
class sNode {
	int value;
	sNode left;
	sNode right;

	public sNode(int value) {
		// TODO Auto-generated constructor stub
		this.value = value;
	}
}

public class Test1009 {

	/**
	 * @param args
	 */
	public static sNode makeTree(String s) {
		sNode root = new sNode(s.charAt(0) - '0');
		for (int i = 1; i < s.length(); i++) {
			int value = s.charAt(i) - '0';
			insert(value, root);
		}
		return root;
	}

	public static void insert(int value, sNode root) {
		sNode node = new sNode(value);
		sNode temp = root;
		while (true)
			if (node.value < temp.value) {
				if (temp.left == null) {
					temp.left = node;
					break;
				} else
					temp = temp.left;
			} else {
				if (temp.right == null) {
					temp.right = node;
					break;
				} else
					temp = temp.right;
			}
	}

	public static boolean find(int value, sNode root) {
		sNode temp = root;
		while (value != temp.value) {
			if (value < temp.value)
				temp = temp.left;
			else
				temp = temp.right;
			if (temp == null)
				return false;
		}
		return true;
	}

	public static StringBuffer print(sNode root) {
		StringBuffer s = new StringBuffer();
		sNode temp = root;
		if (temp != null) {
			s.append(temp.value);
			s.append(print(temp.left));
			s.append(print(temp.right));
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (n == 0)
				break;
			String s = scan.next();
			// build the binary search tree.
			sNode root = makeTree(s);
			String s1 = print(root).toString();
			// check every input case.
			for (int i = 0; i < n; i++) {
				String ss = scan.next();
				sNode newRoot = makeTree(ss);
				String ss1 = print(newRoot).toString();
				boolean isFind = s1.equals(ss1);
				System.out.println(isFind ? "YES" : "NO");
			}
		}
		scan.close();
	}
}
