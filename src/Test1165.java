import java.util.Scanner;


public class Test1165 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			String[] temp=new String[n];
			for (int i = 0; i < n; i++) {
				temp[i]=scan.next();
			}
			String reg=scan.next().toLowerCase();
			for(int i=0;i<n;i++){
				if(temp[i].toLowerCase().matches(reg)){
					System.out.println((i+1)+" "+temp[i]);
				}
			}
		}
		scan.close();
	}
}
