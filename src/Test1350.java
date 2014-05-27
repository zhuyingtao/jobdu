import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年4月14日 下午11:35:19
 */
class bNode {
	int value;
	bNode left;
	bNode right;
}

public class Test1350 {

	/**
	 * @param args
	 */
	static ArrayList<bNode> list = new ArrayList<bNode>();

	public static void buildTree(int root, int left, int right) {
		bNode parent = list.get(root - 1);
		if (left != -1) {
			bNode leftChild = list.get(left - 1);
			parent.left = leftChild;
		}
		if (right != -1) {
			bNode rightChild = list.get(right - 1);
			parent.right = rightChild;
		}
	}

	public static int depth(bNode node) {
		int depth = 0;
		if (node != null) {
			int leftDepth = depth(node.left);
			int rightDepth = depth(node.right);
			depth = leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;
		}
		return depth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			for (int i = 1; i <= n; i++) {
				bNode b = new bNode();
				b.value = i;
				list.add(b);
			}
			for (int i = 1; i <= n; i++) {
				int left = scan.nextInt();
				int right = scan.nextInt();
				buildTree(i, left, right);
			}
			System.out.println(depth(list.get(0)));
		}
		scan.close();
	}
}
