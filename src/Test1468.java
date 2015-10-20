import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Z.Y.T
 *         <p>
 *         2014年5月28日 下午4:11:58
 */

public class Test1468 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int s1 = scan.nextInt();
            int s2 = scan.nextInt();
            int n = scan.nextInt();
            scan.nextLine();
            Set<String> set = new HashSet<>();
            String temp = null;
            for (int i = 0; i < n; i++) {
                String str = scan.nextLine().split(" ")[2];
                if (set.contains(str))
                    temp = str;
                else
                    set.add(str);
            }
            System.out.println(temp);
        }
        scan.close();
    }
}
