import java.util.Arrays;
import java.util.Scanner;

public class Test1034 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			if (n == 0 && m == 0)
				break;
			int[] money=new int[n];
			for(int i=0;i<n;i++){
				money[i]=scan.nextInt();
			}
			Arrays.sort(money);
			for(int i=n-1;i>=(m>n?0:n-m);i--){
				System.out.print(money[i]+(i==(m>n?0:n-m)?"":" "));
			}
			System.out.println();
		}
		scan.close();
	}
}
