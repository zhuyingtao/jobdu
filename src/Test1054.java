import java.util.Arrays;
import java.util.Scanner;


public class Test1054 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			String s=scan.next();
			char[] c=s.toCharArray();
			Arrays.sort(c);
			String n="";
			for(int i=0;i<c.length;i++){
				n=n+c[i];
			}
			System.out.println(n);
		}
		scan.close();
	}
}
