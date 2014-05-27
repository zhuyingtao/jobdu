import java.util.Scanner;

public class Test1169 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int num = scanner.nextInt();
			int odd=0;
			int even=0;
			for(int i=0;i<num;i++){
				int temp=scanner.nextInt();
				if(temp%2==0){
					even++;
				}else odd++;
			}
			if(even>odd){
				System.out.println("NO");
			}else{
				System.out.println("YES");
			}
		}
		scanner.close();
	}
}
