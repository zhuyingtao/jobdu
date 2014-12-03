import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author zyt
 * 
 *         2014年8月23日 下午9:45:24
 */
public class Test1137 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StreamTokenizer st=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		try {
			while (st.nextToken()!=StreamTokenizer.TT_EOF) {
				int n = (int) st.nval;
				System.out.println(n);
				for (int i = 0; i < n; i++) {
					Double d=new Double(st.nval);
					int type=st.nextToken();
					st.ttype=st.TT_WORD;
					if(type==st.TT_NUMBER)
						System.out.println("num");
					System.out.println(type+" "+st.ttype);
					String s=st.nval+"";
					System.out.println(s);
					BigDecimal bd1 = new BigDecimal(s);
					System.out.println(bd1);
					st.nextToken();
					BigDecimal bd2 = new BigDecimal(st.nval);
					System.out.println(bd2);
					BigDecimal bd3 = bd1.add(bd2);
					DecimalFormat df = new DecimalFormat(
							"0.0#######################################"
									+ "########################################"
									+ "###################");
					System.out.println(df.format(bd3));
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
