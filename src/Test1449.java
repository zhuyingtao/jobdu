import java.util.Scanner;

/**
 * @author Z.Y.T
 *         <p>
 *         2014年5月30日 下午5:01:12
 */
public class Test1449 {

    public static String topSort(int[][] array) {
        StringBuffer sb = new StringBuffer();
        int m = array.length;
        // find the indegree of every vertex.
        int[] indegree = new int[m];
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < m; j++) {
                if (array[j][i] != 0)
                    indegree[i]++;
            }
        }
        // System.out.println(Arrays.toString(indegree));
        int count = 0;
        while (count != m - 1) {
            int min = 500;
            for (int i = 1; i < indegree.length; i++) {
                if (indegree[i] == 0 && i < min) {
                    min = i; // to find the minimum i;
                }
            }
            sb.append(min + " ");
            indegree[min] = -1;
            count++;
            for (int j = 0; j < array[min].length; j++) {
                if (array[min][j] != 0) {
                    indegree[j]--;
                }
            }
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int m = scan.nextInt();
            int n = scan.nextInt();
            int[][] array = new int[m + 1][m + 1];
            for (int i = 0; i < n; i++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                array[a][b] = 1;
            }
            System.out.println(topSort(array));
        }
        scan.close();
    }
}
