import java.util.Scanner;

/**
 * @author Z.Y.T
 *         <p>
 *         2014年6月8日 下午8:45:41
 */
public class Test1151 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            for (int i = 0; i < n; i++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                StringBuffer sa = new StringBuffer(Integer.toBinaryString(a));
                StringBuffer sb = new StringBuffer(Integer.toBinaryString(b));
                while (sa.length() < 16)
                    sa.insert(0, '0');
                while (sb.length() < 16)
                    sb.insert(0, '0');
                boolean can = false;
                for (int j = 0; j < 16; j++) {
                    char ch = sa.charAt(0);
                    sa = sa.deleteCharAt(0).append(ch);
                    if (sa.toString().equals(sb.toString())) {
                        can = true;
                        break;
                    }
                }
                System.out.println(can ? "YES" : "NO");
            }
        }
        scan.close();
    }
}
