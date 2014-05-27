import java.util.Scanner;


public class Test1106 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			if(n==0)break;
			else{
				int n2=n*n;
				int sum=0;
				int sum2=0;
				String s1=new String(n+"");
				String s2=new String(n2+"");
				for(int i=0;i<s1.length();i++){
					int j=s1.charAt(i)-'0';
					sum+=j;
				}
				for(int i=0;i<s2.length();i++){
					int j=s2.charAt(i)-'0';
					sum2+=j;
				}
				System.out.println(sum+" "+sum2);
			}
		}
		scan.close();
	}
}
