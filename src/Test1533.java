import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * @author Zhu Yingtao
 * @ClassName Test1533
 * @Description TODO
 * @date 2015年7月7日 上午11:17:42
 */
public class Test1533 {

    // DP O(n^2)
    public static int lis(int[] array) {
        int n = array.length;
        // the length of incremental sequence ended with array[i];
        int[] len = new int[n];
        for (int i = 0; i < n; i++) {
            len[i] = 1;
            for (int j = 0; j < i; j++) {
                if (array[j] < array[i] && len[i] < len[j] + 1) {
                    len[i] = len[j] + 1;
                }
            }
        }
        int max = 1;
        for (int i = 0; i < len.length; i++) {
            if (max < len[i])
                max = len[i];
        }
        return max;
    }

    // DP + BS O(n*lgn)
    public static int lis2(int[] array) {
        int n = array.length;
        // the array minValue stores the minimum value of the last index of i
        // length sequence; It is INCREMENTAL(proof by contradiction).
        // e.g. array = {4,2,1,3}
        // minValue = {0,1,3}
        int[] minValue = new int[n + 1];
        // if the array contains negative;
        for (int i = 0; i < minValue.length; i++) {
            minValue[i] = -1000;
        }
        int len = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] > minValue[len]) {
                // length + 1
                minValue[++len] = array[i];
            } else {
                // because the array is Incremental, using the binary-search can
                // decrease the time to O(lgn); as the minValue array may be as
                // large as the data array, this is necessary.
                int pos = binarySearch(minValue, len, array[i]);
                minValue[pos] = array[i];
            }
        }
        return len;
    }

    public static int binarySearch(int[] array, int len, int val) {
        int left = 0, right = len - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] < val)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return left;
    }

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                st.nextToken();
                array[i] = (int) st.nval;
            }
            System.out.println(lis2(array));
        }
    }
}
