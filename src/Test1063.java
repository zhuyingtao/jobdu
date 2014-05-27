import java.util.Scanner;

public class Test1063 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int sum=0;
			if(n>=0){
				for(int i=n;i<=2*n;i++){
					sum+=i;
				}
			}else{
				for(int i=2*n;i<=n;i++){
					sum+=i;
				}
			}
			System.out.println(sum);
		}
		scan.close();
	}
}
