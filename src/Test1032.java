import java.util.Scanner;

public class Test1032 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		while (true) {
			if (str.startsWith("E")) {
				scanner.close();
				break;
			}
			
			// °´zzzzoooojjjjjjµÄË³Ðò
			// int zs = str.indexOf("z");
			// int os = str.indexOf("o");
			// int js = str.indexOf("j");
			// int ze = str.lastIndexOf("z");
			// int oe = str.lastIndexOf("o");
			// int je = str.lastIndexOf("j");
			// int zCount = zs==-1?0:ze - zs+1;
			// int oCount = os==-1?0:oe - os+1;
			// int jCount = js==-1?0:je - js+1;
			int zCount = 0, oCount = 0, jCount = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'Z')
					zCount++;
				else if (str.charAt(i) == 'O')
					oCount++;
				else if (str.charAt(i) == 'J')
					jCount++;
			}
			// System.out.println(zCount+" "+oCount+" "+jCount);
			while (zCount > 0 || oCount > 0 || jCount > 0) {
				System.out.print((zCount > 0 ? "Z" : "")
						+ (oCount > 0 ? "O" : "") + (jCount > 0 ? "J" : ""));
				zCount--;
				oCount--;
				jCount--;
			}
			System.out.println();
			str = scanner.nextLine();
		}
	}
}
