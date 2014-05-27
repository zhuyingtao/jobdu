public class Test1074 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 256; i++) {
			String s = Integer.toString(i * i);
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) != s.charAt(s.length() - 1 - j))
					break;
				if (j >= s.length() / 2) {
					System.out.println(i);
					break;
				}
			}
		}
	}
}
