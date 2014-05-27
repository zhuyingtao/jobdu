import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


/**
 * @author Z.Y.T
 *
 * 2014年4月6日 下午2:36:45
 */
public class Test1099 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			String s=scan.next();
			ArrayList<String> array=new ArrayList<String>();
			for (int i = 0; i < s.length(); i++) {
				String temp=s.substring(i);
				array.add(temp);
			}
			Collections.sort(array);
			for (String string : array) {
				System.out.println(string);
			}
		}
		scan.close();
	}

}
