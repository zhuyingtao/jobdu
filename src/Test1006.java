import java.util.Scanner;

public class Test1006 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            if (str.matches("o*zo+jo*")) {
                int start = str.indexOf("z");
                int end = str.indexOf("j");
                int os = start;
                int oe = str.length() - end - 1;

                int middle = end - start - 1;
                if (oe == os * middle) {
                    System.out.println("Accepted");
                } else {
                    System.out.println("Wrong Answer");
                }

            } else {
                System.out.println("Wrong Answer");
            }
        }
        scanner.close();
    }
}
