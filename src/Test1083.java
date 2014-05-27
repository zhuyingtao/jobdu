import java.util.Scanner;


public class Test1083 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			String a=scan.next();
			String b=scan.next();
			char[] ca=a.toCharArray();
			char[] cb=b.toCharArray();
			long sum=0;
			for(int i=0;i<ca.length;i++){
				for(int j=0;j<cb.length;j++){
					sum+=(ca[i]-'0')*(cb[j]-'0');
				}
			}
			System.out.println(sum);
		}
		scan.close();
	}
}
