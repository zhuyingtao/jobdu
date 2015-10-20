import java.util.Scanner;

public class Test1252 {

    public static int find(int m, int n, String s) {
        int temp = 0;
        while (--m >= 0 && ++n <= s.length() - 1) {
            if (s.charAt(m) != s.charAt(n))
                break;
            temp += 2;
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String s = scan.next();
            int max = 0;
            for (int i = 1; i < s.length() - 1; i++) {
                int m = 0, n = 0, temp = 0;

                if (s.charAt(i) == s.charAt(i - 1)) {
                    m = i - 1;
                    n = i;
                    temp = find(m, n, s) + 2;
                    if (temp > max)
                        max = temp;
                }
                if (s.charAt(i - 1) == s.charAt(i + 1)) {
                    m = i - 1;
                    n = i + 1;
                    temp = find(m, n, s) + 3;
                    if (temp > max)
                        max = temp;
                }
            }
            System.out.println(max);
        }
        scan.close();
    }
}
