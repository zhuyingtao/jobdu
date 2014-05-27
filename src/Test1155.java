import java.util.Scanner;


public class Test1155 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			for(int i=0;i<n;i++){
				int a=scan.nextInt();
				int rabbit=0;
				int chicken=0;
				if((a%4)%2==0){
					rabbit=a/4;
					chicken=(a%4)/2;
				}
				int min=rabbit+chicken;
				
				if((a%2)%4==0){
					chicken=a/2;
					rabbit=(a%2)/4;
				}
				int max=rabbit+chicken;
				System.out.println(min+" "+max);
			}
		}
		scan.close();
	}
}
