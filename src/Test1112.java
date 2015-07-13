import java.util.Scanner;

/**
 * @author zyt
 * 
 *         2014年9月25日 下午5:28:12
 */
public class Test1112 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int[] array = new int[n];
			int[] length = new int[n];
			for (int i = 0; i < n; i++) {
				array[i] = scan.nextInt();
			}

			for (int i = 0; i < n; i++) {
				length[i] = 1;
				for (int j = 0; j < i; j++) {
					if (array[j] >= array[i] && length[i] <= length[j])
						length[i] = length[j] + 1;
				}
			}
			// System.out.println(Arrays.toString(length));
			int max = 0;
			for (int i = 0; i < n; i++) {
				if (max < length[i])
					max = length[i];
			}
			System.out.println(max);
		}
	}
}
