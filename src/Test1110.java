import java.util.Scanner;
import java.util.TreeMap;


public class Test1110 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			TreeMap<Integer, String> t=new TreeMap<Integer,String>();
			for(int i=0;i<n;i++){
				int weight=scan.nextInt();
				String color=scan.next();
				t.put(weight, color);
			}
			int s=t.size();
			for(int i=0;i<s;i++){
				System.out.println(t.get(t.lastKey()));
				t.remove(t.lastKey());
			}
		}
		scan.close();
	}
}
