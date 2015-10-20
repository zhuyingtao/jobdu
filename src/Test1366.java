import java.util.Scanner;
import java.util.Stack;

/**
 * @author Z.Y.T
 *         <p>
 *         2014年5月30日 上午11:59:18
 */
public class Test1366 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            int[] inArray = new int[n];
            int[] outArray = new int[n];
            for (int i = 0; i < inArray.length; i++) {
                inArray[i] = scan.nextInt();
            }
            for (int i = 0; i < outArray.length; i++) {
                outArray[i] = scan.nextInt();
            }

            Stack<Integer> stack = new Stack<Integer>();
            int index = 0;
            int outdex = 0;
            int out = outArray[outdex];
            boolean suit = true;
            while (true) {
                if (stack.isEmpty() || stack.peek() != out) {
                    if (index == n) {
                        suit = false;
                        break;
                    }
                    stack.push(inArray[index++]);
                } else if (stack.peek() == out) {
                    if (outdex == n - 1)
                        break;
                    stack.pop();
                    out = outArray[++outdex];
                }
            }
            System.out.println(suit ? "Yes" : "No");
        }
        scan.close();
    }
}
