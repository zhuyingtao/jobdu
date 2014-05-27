import java.util.Scanner;

public class Test1057 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int[] count=new int[10];
			for (int i = 0; i < 20; i++) {
				int temp=scan.nextInt();
				for(int j=1;j<=10;j++){
					if(temp==j)count[j-1]++;
				}
			}
			int max=0;
			int index=0;
			for(int i=0;i<10;i++){
				if(count[i]>max){
					max=count[i];
					index=i+1;
				}
			}
			System.out.println(index);
		}
		scan.close();
	}
}
