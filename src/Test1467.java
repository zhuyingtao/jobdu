import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年4月15日 下午7:04:45
 */

class btNode {
	int value;
	btNode left;
	btNode right;

	public btNode(int value) {
		// TODO Auto-generated constructor stub
		this.value = value;
	}
}

public class Test1467 {

	/**
	 * @param args
	 */
	public static void makeBST(int[] array) {
		btNode root = new btNode(array[0]);
		System.out.println("-1");
		for (int i = 1; i < array.length; i++) {
			int value = array[i];
			insert(value, root);
		}
	}

	public static void insert(int value, btNode root) {
		btNode node = new btNode(value);
		btNode temp = root;

		while (true)
			if (node.value < temp.value) {
				if (temp.left == null) {
					temp.left = node;
					System.out.println(temp.value);
					break;
				} else
					temp = temp.left;
			} else if (node.value > temp.value) {
				if (temp.right == null) {
					temp.right = node;
					System.out.println(temp.value);
					break;
				} else
					temp = temp.right;
			} else {
				break;
			}
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
			makeBST(array);
		}
		scan.close();
	}
}
