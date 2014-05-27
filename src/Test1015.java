import java.util.Scanner;

public class Test1015 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int k = scan.nextInt();
			int ans=-1;
			if (a == 0 && b == 0)
				break;
			String tempA = new Integer(a).toString();
			String tempB = new Integer(b).toString();
			int aL = tempA.length();
			int bL = tempB.length();
			if (k < aL)
				tempA = tempA.substring(aL - k, aL);
			if (k < bL)
				tempB = tempB.substring(bL - k, bL);
			if(Integer.parseInt(tempA)!=Integer.parseInt(tempB)){
				ans=a+b;
			}
			System.out.println(ans);
		}
		scan.close();
	}
}
