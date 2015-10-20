import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Hashtable;

/**
 * @author zyt
 *         <p>
 *         2014年8月12日 下午5:49:32
 */
public class Test1370 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));
        try {
            while (st.nextToken() != StreamTokenizer.TT_EOF) {
                int n = (int) st.nval;
                int num = -1;
                Hashtable<Integer, Integer> table = new Hashtable<>();
                for (int i = 0; i < n; i++) {
                    st.nextToken();
                    int t = (int) st.nval;
                    if (num != -1)
                        continue;
                    if (table.containsKey(t)) {
                        table.put(t, table.get(t) + 1);
                    } else
                        table.put(t, 1);
                    if (table.get(t) > n / 2)
                        num = t;
                }
                System.out.println(num);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
