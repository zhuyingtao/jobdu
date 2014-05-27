import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Z.Y.T
 * 
 *         2014年5月26日 上午11:49:38
 */
public class Test1146 {

	/**
	 * @param args
	 */
	public static int findLast(int[] array, int last) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == last)
				return i;
		}
		return 0;
	}

	public static void swap(int[] array, int lastIndex) {
		int j = lastIndex + 1;
		int[] temp = new int[j];
		for (int i = 0; i < j; i++) {
			temp[i] = array[lastIndex - i];
		}
		for (int i = 0; i < j; i++) {
			array[i] = temp[i];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (n == 0)
				break;
			int[] array = new int[n];
			for (int i = 0; i < array.length; i++) {
				array[i] = scan.nextInt();
			}
			ArrayList<Integer> steps = new ArrayList<Integer>();
			int last = n;
			boolean ordered = false;
			while (last != 1 && !ordered) {
				int lastIndex = findLast(array, last);
				if (lastIndex != 0) {
					steps.add(lastIndex + 1);
					swap(array, lastIndex);
				}
				steps.add(last);
				swap(array, last - 1);
				last--;
				for (int i = 0; i < array.length; i++) {
					if (array[i] != i + 1)
						break;
					if (i == n - 1)
						ordered = true;
				}
			}
			System.out.print(steps.size() + " ");
			for (Integer integer : steps) {
				System.out.print(integer + " ");
			}
			System.out.println();
		}
		scan.close();
	}
}
