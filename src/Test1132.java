import java.util.Scanner;


public class Test1132 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			int sum=0;
			for(int i=1;i<=n;i++){
				boolean hasSeven=false;
				String temp=i+"";
				for(int j=0;j<temp.length();j++){
					if(temp.charAt(j)=='7'){
						hasSeven=true;
						break;
					}
				}
				if(i%7==0||hasSeven){
					continue;
				}
				sum+=i*i;
			}
			System.out.println(sum);
		}
		scan.close();
	}
}
