import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author Z.Y.T
 *         <p>
 *         2014年5月21日 下午5:34:16
 */
public class Test1149 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String str = scan.next();
            TreeMap<String, Integer> map = new TreeMap<String, Integer>();
            for (int i = 0; i < str.length(); i++) {
                for (int j = i + 1; j <= str.length(); j++) {
                    String sub = str.substring(i, j);
                    if (map.containsKey(sub)) {
                        map.put(sub, map.get(sub) + 1);
                    } else
                        map.put(sub, 1);
                }
            }
            int n = map.size();
            for (int i = 0; i < n; i++) {
                String sub = map.firstKey();
                int value = map.get(sub);
                if (value == 1) {
                    map.remove(sub);
                } else {
                    System.out.println(sub + " " + value);
                    map.remove(sub);
                }
            }
        }
        scan.close();
    }
}
