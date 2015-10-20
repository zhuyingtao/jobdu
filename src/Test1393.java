import java.io.IOException;
import java.io.StreamTokenizer;

/**
 * @author Zhu Yingtao
 * @ClassName Test1393
 * @Description TODO
 * @date 2015年7月3日 下午5:19:35
 */
public class Test1393 {

    /**
     * @param args
     * @throws IOException
     * @Title: main
     * @Description: TODO
     */
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        StreamTokenizer st = new StreamTokenizer(System.in);
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) st.nval;
            int[] tempA = new int[n];
            int[] tempB = new int[n];
            for (int i = 0; i < n; i++) {
                st.nextToken();
                tempA[i] = (int) st.nval;
            }
            for (int i = 0; i < n; i++) {
                st.nextToken();
                tempB[i] = (int) st.nval;
            }
            int i = 0, j = 0;
            StringBuffer sb = new StringBuffer();
            while (i < n && j < n) {
                if (tempA[i] < tempB[j]) {
                    sb.append(tempA[i]);
                    sb.append(" ");
                    i++;
                } else {
                    sb.append(tempB[j]);
                    sb.append(" ");
                    j++;
                }
            }
            while (i < n) {
                sb.append(tempA[i]);
                sb.append(" ");
                i++;
            }
            while (j < n) {
                sb.append(tempB[j]);
                sb.append(" ");
                j++;
            }
            System.out.println(sb.toString().trim());
        }
    }
}
