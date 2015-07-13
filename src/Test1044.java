import java.util.Scanner;

/**
 * @author zyt
 * 
 *         2014年9月25日 上午9:27:42
 */
public class Test1044 {

	public static void buildTree(String pre, String post, int k) {
		if (pre.length() == 1) {
			return;
		}
		char root = pre.charAt(0);
		char root1 = post.charAt(post.length() - 1);
		if (root != root1) {
			System.out.println("error");
			return;
		}
		int subTreeCount = 0;
		char child = pre.charAt(1);
		int childPreIndex = 1;
		int childPostIndex = post.lastIndexOf(child);
		int subTreeNode = 0;
		for (int i = 2; i < pre.length(); i++) {
			char node = pre.charAt(i);
			int nodePostIndex = post.lastIndexOf(node);
			if (nodePostIndex > childPostIndex) {
				subTreeCount++;
				String subPre = pre.substring(childPreIndex, i);
				String subPost = post.substring(childPostIndex - subTreeNode,
						childPostIndex + 1);
				System.out.println(subPre + "\t" + subPost);
				buildTree(subPre, subPost, k);
				child = node;
				childPreIndex = i;
				childPostIndex = nodePostIndex;
				subTreeNode = 0;
			} else {
				subTreeNode++;
			}
		}
		System.out.println(subTreeCount);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int k = scan.nextInt();
			if (k == 0)
				break;
			String pre = scan.next();
			String post = scan.next();
			buildTree(pre, post, k);
		}
		scan.close();
	}

}
