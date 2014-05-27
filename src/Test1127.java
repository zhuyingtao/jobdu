import java.util.Scanner;


public class Test1127 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			String str=scan.nextLine();
			if(str.equals("ENDOFINPUT"))break;
			else if(str.equals("START")){
				str=scan.nextLine();
				StringBuffer sb=new StringBuffer(str);
				for(int i=0;i<str.length();i++){
					if(sb.charAt(i)>='A'&&sb.charAt(i)<='E'){
						sb.setCharAt(i, (char)(sb.charAt(i)+21));
					}else if(sb.charAt(i)>='F'&&sb.charAt(i)<='Z'){
						sb.setCharAt(i, (char)(sb.charAt(i)-5));
					}
				}
				str=scan.nextLine();
				if(str.equals("END")){
					System.out.println(sb);
				}
			}
		}
		scan.close();
	}
}
