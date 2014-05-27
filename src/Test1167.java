import java.util.Arrays;
import java.util.Scanner;


public class Test1167 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			int[] array=new int[n];
			int[] temp=new int[n];
			for(int i=0;i<n;i++){
				array[i]=scan.nextInt();
				temp[i]=array[i];
			}
			
			Arrays.sort(temp);
			for(int i=0;i<n;i++){
				int count=1;
				int last=-55555; //取不可能取到的值
				for(int j=0;j<n;j++){
					if(array[i]==temp[j]){
						break;
					}
					if(temp[j]!=last){
						count++;
					}
					last=temp[j];
				}
				System.out.print(count+(i==n-1?"":" "));
			}
			System.out.println();
		}
		scan.close();
	}
}
