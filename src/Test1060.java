
public class Test1060 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] e=new int[60];
		int eindex=0;
		int[] g=new int[60];
		int gindex=0;
		for(int i=2;i<=60;i++){
			int sum=0;
			for(int j=1;j<i;j++){
				if(i%j==0){
					sum+=j;
				}
			}
			if(i==sum){
				e[eindex]=i;
				eindex++;
			}else if(i<sum){
				g[gindex]=i;
				gindex++;
			}
		}
		System.out.print("E: ");
		for(int i=0;i<eindex;i++){
			System.out.print(e[i]+(i==eindex-1?"":" "));
		}
		System.out.println();
		System.out.print("G: ");
		for(int i=0;i<gindex;i++){
			System.out.print(g[i]+(i==gindex-1?"":" "));
		}
	}

}
