import java.util.Scanner;

public class Test1199 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str = scan.next();
			char[] ch = str.toCharArray();
			boolean[] hasCheck = new boolean[ch.length];
			for (int i = 0; i < hasCheck.length; i++) {
				hasCheck[i] = false;
			}
			for (int i = 0; i < ch.length; i++) {
				if (hasCheck[i] == true)
					continue;
				char temp = ch[i];
				boolean hasSame=false;
				StringBuffer sb=new StringBuffer();
				for (int j = i+1; j < ch.length; j++) {
					if(ch[j]==temp&&hasCheck[j]==false){
						hasCheck[j]=true;
						sb.append(","+temp+":"+j);
						hasSame=true;
					}
				}
				if(hasSame){
					System.out.println(temp+":"+i+sb);
				}
			}
		}
		scan.close();
	}
}
