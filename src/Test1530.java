import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName Test1530
 * @Description TODO
 * @author Zhu Yingtao
 * @date 2015年7月8日 下午2:53:05
 */
public class Test1530 {

	public static int lnrs(char[] array) {
		int n = array.length;
		int[] len = new int[n];
		int[] flag = new int[26];
		int max = 0;
		for (int i = 0; i < n; i++) {
			int index = array[i] - 'a';
			if (flag[index] == 0) {
				// not find in sequence;
				len[i] = (i == 0 ? 1 : len[i - 1] + 1);
				flag[index] = 1;
			} else {
				// find in sequence, find the repeated character's index from
				// end to start;
				int count = 0;
				flag = new int[26];
				for (int j = i - 1; j >= 0; j--) {
					if (array[i] == array[j]) {
						break;
					} else {
						flag[array[j] - 'a'] = 1;
						count++;
					}
				}
				len[i] = count + 1; // add array[i];
				flag[index] = 1;
			}
			if (max < len[i])
				max = len[i];
		}
		return max;
	}

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String s = scan.next();
			System.out.println(lnrs(s.toCharArray()));
		}
		scan.close();
	}
}
