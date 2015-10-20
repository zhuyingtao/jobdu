import java.util.Scanner;

/**
 * @author Z.Y.T
 *         <p>
 *         2014年5月27日 下午6:08:21
 */
public class Test1466 {

    public static int compute(int n, int m) {
        int count = 0;
        for (int i = n; i > n - m; i--) {
            String str = Integer.toBinaryString(i);
            for (int j = str.length() - 1; j >= 0; j--) {
                if (str.charAt(j) != '0')
                    break;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            if (n == 0)
                break;
            int count = compute(n, m);
            System.out.println(count);
        }
        scan.close();
    }
}
