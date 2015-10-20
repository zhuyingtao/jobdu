import java.util.Scanner;

/**
 * @author Z.Y.T
 *         <p>
 *         2014年3月23日 下午7:13:50
 */
public class Test1160 {

    public static int fun(int m, int n) {
        if (m == 0 || n == 1)
            return 1;
        if (m < 0)
            return 0;
        return fun(m, n - 1) + fun(m - n, n);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int m = scan.nextInt();
            int n = scan.nextInt();
            System.out.println(fun(m, n));
        }
        scan.close();
    }
}
