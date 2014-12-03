import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author zyt
 * 
 *         2014年8月8日 下午5:15:01
 */
public class Test1082 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			Map<String, Integer> ipMap = new HashMap<String, Integer>();
			for (int i = 0; i < n; i++) {
				String ip = scanner.next();
				ipMap.put(ip, i);
			}
			int m = scanner.nextInt();
			Set<String> ipSet = new HashSet<String>();
			int times = 0;
			for (int i = 0; i < m; i++) {
				String ip = scanner.next();
				if (ipMap.containsKey(ip)) {
					ipSet.add(ip);
				}
				if (ipSet.size() == n) {
					times = (n == 1) ? -1 : (times + 1);
					ipSet = new HashSet<String>();
				}
			}
			System.out.println(times);
		}
	}
}
