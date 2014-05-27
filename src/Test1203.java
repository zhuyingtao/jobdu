import java.util.Scanner;


public class Test1203 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			for(int i=0;i<n;i++){
				String str=scan.next();
				String[] temp=str.split("\\.");
				for(int j=0;j<temp.length;j++){
					if(Integer.parseInt(temp[j])>255){
						System.out.println("No!");
						break;
					}
					if(j==temp.length-1){
						System.out.println("Yes!");
					}
				}
			}
		}
		scan.close();
	}
}
