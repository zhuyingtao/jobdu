import java.util.Arrays;
import java.util.Scanner;


public class Test1202 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			int[] temp=new int[n];
			for (int i = 0; i < temp.length; i++) {
				temp[i]=scan.nextInt();
			}
			Arrays.sort(temp);
			for (int i = 0; i < temp.length; i++) {
				System.out.print(temp[i]+" ");
			}
			System.out.println();
		}
		scan.close();
	}
}
