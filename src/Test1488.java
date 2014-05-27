
public class Test1488 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rich=0;
		int poor=0;
		for(int i=0;i<30;i++){
			rich+=10;
			poor+=Math.pow(2, i);
		}
		System.out.println(rich+" "+poor);
	}

}
