import java.util.Scanner;

public class Test1097 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int aLength = scan.nextInt();
			int bLength = scan.nextInt();
			int[] a = new int[aLength];
			int[] b = new int[bLength];
			for (int m = 0; m < aLength; m++) {
				a[m] = scan.nextInt();
			}
			for (int j = 0; j < bLength; j++) {
				b[j] = scan.nextInt();
			}
			int as = scan.nextInt();
			int ae = scan.nextInt();
			int aSub = ae - as + 1;
			int bs = scan.nextInt();
			int be = scan.nextInt();
			int bSub = be - bs + 1;
			int count=aSub+bSub;
			int middle=(int)Math.ceil(count/2.0);
			if(middle>aSub){
				int index=middle-aSub;
				System.out.println(b[bs-1+index-1]);
			}else{
				System.out.println(a[as-1+middle-1]);
			}
		}
		scan.close();
	}
}
