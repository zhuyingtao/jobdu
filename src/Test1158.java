import java.util.Scanner;


public class Test1158 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int salary=scan.nextInt();
			double rate=scan.nextInt()*0.01+1;
			double sum=0;
			double house=200;
			for(int i=0;i<20;i++){
				sum+=salary;
				house=200*Math.pow(rate, i);
				if(sum>=house){
					System.out.println(i+1);
					break;
				}
				if(i==19){
					System.out.println("Impossible");
				}
			}
		}
		scan.close();
	}
}
