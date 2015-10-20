import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Z.Y.T
 *         <p>
 *         2014年5月30日 下午9:15:06
 */
public class Test1450 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            if (n == 0)
                break;
            ArrayList<String> name = new ArrayList<>();
            int[] indegree = new int[1000];
            for (int i = 0; i < n; i++) {
                String a = scan.next();
                String b = scan.next();
                if (!name.contains(a))
                    name.add(a);
                if (!name.contains(b))
                    name.add(b);
                int indexb = name.indexOf(b);
                indegree[indexb]++;
            }
            int count = 0;
            for (int i = 0; i < name.size(); i++) {
                if (indegree[i] == 0) {
                    count++;
                }
            }
            System.out.println((count == 1 ? "Yes" : "No"));
        }
        scan.close();
    }
}
