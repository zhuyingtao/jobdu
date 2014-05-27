import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年4月11日 下午7:37:53
 */
public class Test1176 {

	/**
	 * @param args
	 */
	public static void getDepth(int[] nodes, int k) {
		int[] depth = new int[nodes.length];
		for (int i = 0; i < nodes.length; i++) {
			depth[i] = (int) (Math.log(i + 1) / Math.log(2))+1;
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < depth.length; i++) {
			if (depth[i] == k)
				sb.append(nodes[i] + " ");
			if (depth[i] > k)
				break;
		}
		sb = sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int[] array = new int[n];
			for (int i = 0; i < n; i++) {
				array[i] = scan.nextInt();
			}
			int k = scan.nextInt();
			getDepth(array, k);
		}
		scan.close();
	}
}
