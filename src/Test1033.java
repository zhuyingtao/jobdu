import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @ClassName Test1033
 * @Description TODO
 * @author Zhu Yingtao
 * @date 2015年7月6日 下午3:40:21
 */
public class Test1033 {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (n == 0)
				break;
			ArrayList<Integer> value = new ArrayList<Integer>();
			HashSet<Integer> data = new HashSet<Integer>();
			for (int i = 0; i < n; i++) {
				int m = scan.nextInt();
				value.add(m);
				while (m != 1) {
					if (m % 2 == 0)
						m /= 2;
					else
						m = (3 * m + 1) / 2;
					data.add(m);
				}
			}
			StringBuffer sb = new StringBuffer();
			for (int i = value.size() - 1; i >= 0; i--) {
				if (!data.contains(value.get(i))) {
					sb.append(value.get(i) + " ");
				}
			}
			System.out.println(sb.toString().trim());
		}
		scan.close();
	}
}
