import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * @author Z.Y.T
 *         <p>
 *         2014年5月22日 上午2:05:42
 */
public class Test1352 {

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        try {
            while (st.nextToken() != StreamTokenizer.TT_EOF) {
                int n = (int) st.nval;
                st.nextToken();
                int k = (int) st.nval;
                int[] array = new int[n];
                for (int i = 0; i < array.length; i++) {
                    st.nextToken();
                    array[i] = (int) st.nval;
                }
                boolean hasFound = false;
                int a = 0, b = 0;
                int left = 0, right = n - 1;
                while (left < right) {
                    int sum = array[left] + array[right];
                    if (sum < k)
                        left++;
                    else if (sum == k) {
                        hasFound = true;
                        a = array[left];
                        b = array[right];
                        break;
                    } else
                        right--;
                }
                // for (int i = 0; i < array.length; i++) {
                // for (int j = array.length - 1; j > i; j--) {
                // if (array[i] + array[j] < k) {
                // break;
                // } else if (array[i] + array[j] == k) {
                // hasFound = true;
                // a = array[i];
                // b = array[j];
                // break;
                // }
                // }
                // if (hasFound)
                // break;
                // }
                if (!hasFound) {
                    a = -1;
                    b = -1;
                }
                System.out.println(a + " " + b);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
