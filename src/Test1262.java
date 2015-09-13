import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * @ClassName Test1262
 * @Description TODO
 * @author Zhu Yingtao
 * @date 2015年7月7日 下午11:53:05
 */
public class Test1262 {

	public static void lis(int[] array) {
		int n = array.length;
		int len[] = new int[n];
		int pre[] = new int[n];

		// find the lis;
		int maxLen = 0;
		int maxLenIndex = -1;
		for (int i = 0; i < n; i++) {
			len[i] = 1;
			for (int j = 0; j < i; j++) {
				if (array[i] > array[j] && len[i] < len[j] + 1) {
					len[i] = len[j] + 1;
					pre[i] = j;
				}
			}
			if (len[i] > maxLen) {
				maxLen = len[i];
				maxLenIndex = i;
			}
		}

		// print the lis;
		StringBuffer sb = new StringBuffer();
		int index = maxLenIndex;
		int leng = maxLen;
		while (leng != 0) {
			sb.insert(0, array[index] + " ");
			index = pre[index];
			leng--;
		}
		System.out.println(sb.toString().trim());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(new BufferedInputStream(System.in));
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int[] array = new int[n];
			for (int i = 0; i < n; i++) {
				array[i] = scan.nextInt();
			}
			lis(array);
		}
		scan.close();
	}
}
