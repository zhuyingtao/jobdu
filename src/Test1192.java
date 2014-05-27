import java.util.Scanner;


public class Test1192 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			String str=scan.nextLine();
			boolean flag=true;
			for(int i=0;i<str.length()/2;i++){
				if(str.charAt(i)!=str.charAt(str.length()-1-i)){
					flag=false;
					break;
				}
			}
			if(flag==true){
				System.out.println("Yes!");
			}else{
				System.out.println("No!");
			}
		}
		scan.close();
	}
}
