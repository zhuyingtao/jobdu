import java.util.Scanner;

public class Test1011 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            if (n == 0)
                break;
            int[] temp = new int[n];
            long[] sum = new long[n];
            for (int i = 0; i < n; i++) {
                temp[i] = scan.nextInt();
                sum[i] = temp[i];
            }
            for (int i = 1; i < n; i++) {
                if (sum[i - 1] > 0)
                    sum[i] += sum[i - 1];
            }
            long max = Long.MIN_VALUE;
            int lastIndex = 0;
            for (int i = 0; i < n; i++) {
                if (max < sum[i]) {
                    max = sum[i];
                    lastIndex = i;
                }
            }
            int tempSum = 0;
            int firstIndex = 0;
            for (int i = lastIndex; i >= 0; i--) {
                tempSum += temp[i];
                if (tempSum == max) {
                    firstIndex = i;
                    break;
                }
            }
            for (int i = 0; i < n; i++) {
                if (temp[i] >= 0)
                    break;
                if (i == n - 1) {
                    max = 0;
                    firstIndex = 0;
                    lastIndex = n - 1;
                }
            }
            System.out.println(max + " " + temp[firstIndex] + " "
                    + temp[lastIndex]);
        }
        scan.close();
    }
}
