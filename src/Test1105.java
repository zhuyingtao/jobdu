import java.util.Scanner;


public class Test1105 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			String str=scan.nextLine();
			String newStr="";   //=null re?
			if(str.equals("!"))break;
			for(int i=0;i<str.length();i++){
				char n=str.charAt(i);
				char u = n;
				if(n>='a'&&n<='z'){
					u=(char)('z'-(n-'a'));
					
				}else if(n>='A'&&n<='Z'){
					u=(char)('Z'-(n-'A'));
				}
				newStr=newStr.concat(u+"");
			}
			System.out.println(newStr);
		}
		scan.close();
	}
}
