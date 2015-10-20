import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author Zhu Yingtao
 * @ClassName Test1472
 * @Description TODO
 * @date 2015年7月6日 上午10:43:31
 */
public class Test1472 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for (int i = 0; i < 2; i++) {
                int n = scan.nextInt();
                for (int j = 0; j < n; j++) {
                    int x = scan.nextInt();
                    int t = scan.nextInt();
                    map.put(t, map.containsKey(t) ? (map.get(t) + x) : x);
                }
            }
            StringBuffer sb = new StringBuffer();
            while (map.size() > 0) {
                Entry<Integer, Integer> entry = map.pollLastEntry();
                if (entry.getValue() == 0)
                    continue;
                sb.append(entry.getValue() + " " + entry.getKey() + " ");
            }
            System.out.println(sb.toString().trim());
        }
        scan.close();
    }
}
