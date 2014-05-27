import java.util.Scanner;


public class Test1134 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			scan.nextLine();
			for (int i = 0; i < n; i++) {
				String s=scan.nextLine();
				StringBuffer sb=new StringBuffer(s);
				for (int j = 0; j < sb.length(); j++) {
					char c=sb.charAt(j);
					if(c=='z'||c=='Z'){
						sb.setCharAt(j, (char)(c-25));
						continue;
					}
					if(c>='a'&&c<='y'||c>='A'&&c<='Y'){
						sb.setCharAt(j, (char)(c+1));
					}
				}
				System.out.println(sb);
			}
		}
		scan.close();
	}

}
