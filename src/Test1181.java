import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Test1181 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			ArrayList<Integer> list=new ArrayList<Integer>();
			for(int i=0;i<n;i++){
				int k=scan.nextInt();
				list.add(k);
			}
			Collections.sort(list);
			StringBuffer sb=new StringBuffer();
			for (int i = 0; i < list.size(); i++) {
				sb.append(list.get(i)+(i==list.size()-1?"":" "));
			}
			System.out.println(sb);
		}
		scan.close();
	}
}
