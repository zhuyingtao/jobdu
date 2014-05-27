
public class Test1064 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=1;a<10;a++){
			for(int b=0;b<10;b++){
				for(int c=0;c<10;c++){
					for(int d=0;d<10;d++){
						if((a*1000+b*100+c*10+d)*9==(d*1000+c*100+b*10+a)){
							System.out.println(a+""+b+c+d);
						}
					}
				}
			}
		}
	}
}
