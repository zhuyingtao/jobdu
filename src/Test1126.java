import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年5月21日 下午7:46:52
 */
public class Test1126 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		@SuppressWarnings("unused")
		int n = scan.nextInt();
		while (scan.hasNext()) {
			int k = scan.nextInt();
			int[] array = new int[k];
			for (int i = 0; i < array.length; i++) {
				array[i] = scan.nextInt();
			}
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < array.length; i++) {
				if (i == 0
						&& (array[i] < array[i + 1] || array[i] > array[i + 1]))
					sb.append(i + " ");
				else if (i == array.length - 1
						&& (array[i] < array[i - 1] || array[i] > array[i - 1]))
					sb.append(i + " ");
				else if ((i != 0 && i != array.length - 1)
						&& (array[i] < array[i + 1] && array[i] < array[i - 1] || array[i] > array[i + 1]
								&& array[i] > array[i - 1]))
					sb.append(i + " ");
			}
			sb = sb.deleteCharAt(sb.length() - 1);
			System.out.println(sb);
		}
		scan.close();
	}
}
