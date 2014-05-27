import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class ImagiNum implements Comparable<ImagiNum> {
	int a;
	int b;

	public ImagiNum(int a, int b) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
	}

	public int compareTo(ImagiNum o) {
		// TODO Auto-generated method stub
		if (a * a + b * b > o.a * o.a + o.b * o.b) {
			return 1;
		} else if (a * a + b * b < o.a * o.a + o.b * o.b) {
			return -1;
		} else if (a * a + b * b == o.a * o.a + o.b * o.b) {
			if (b < o.b)
				return 1;
			else if (b > o.b)
				return -1;
		}
		return 0;
	}

	public String toString() {
		return this.a + "+i" + this.b;
	}
}

public class Test1178 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			ArrayList<ImagiNum> temp = new ArrayList<ImagiNum>();
			for (int i = 0; i < n; i++) {
				String com = scan.next();
				if (com.equals("Pop")) {
					Collections.sort(temp);
					int len = temp.size();
					if (len == 0) {
						System.out.println("empty");
					} else {
						ImagiNum in = temp.get(len - 1);
						System.out.println(in.toString());
						temp.remove(len - 1);
						System.out.println("SIZE = " + temp.size());
					}
				}else if(com.equals("Insert")){
					String str=scan.next();
					String[] s=str.split("\\+i"); // + is ambiguous
					int a=Integer.parseInt(s[0]);
					int b=Integer.parseInt(s[1]);
					ImagiNum in=new ImagiNum(a, b);
					temp.add(in);
					System.out.println("SIZE = " + temp.size());
				}
			}
		}
		scan.close();
	}
}
