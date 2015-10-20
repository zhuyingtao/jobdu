import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Z.Y.T
 *         <p>
 *         2014年4月14日 下午11:35:19
 */


public class Test1350 {

    static class Node {
        int value;
        Node left;
        Node right;
    }

    static ArrayList<Node> list = new ArrayList<>();

    public static void buildTree(int root, int left, int right) {
        Node parent = list.get(root - 1);
        if (left != -1) {
            parent.left = list.get(left - 1);
        }
        if (right != -1) {
            parent.right = list.get(right - 1);
        }
    }

    public static int depth(Node node) {
        int depth = 0;
        if (node != null) {
            int leftDepth = depth(node.left);
            int rightDepth = depth(node.right);
            depth = leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;
        }
        return depth;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            for (int i = 1; i <= n; i++) {
                Node b = new Node();
                b.value = i;
                list.add(b);
            }
            for (int i = 1; i <= n; i++) {
                int left = scan.nextInt();
                int right = scan.nextInt();
                buildTree(i, left, right);
            }
            System.out.println(depth(list.get(0)));
        }
        scan.close();
    }
}
