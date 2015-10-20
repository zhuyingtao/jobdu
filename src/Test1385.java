import java.util.Scanner;

/**
 * @author Z.Y.T
 *         <p>
 *         2014年4月16日 下午2:07:17
 */

public class Test1385 {


    static class Node {
        int value;
        Node left;
        Node right;
    }

    static boolean canMake = true;

    public static Node makeTree(int[] preOrder, int[] inOrder) {
        if (preOrder.length == 0)
            return null;
        Node root = new Node();
        int rootValue = preOrder[0];

        int rootPos = 0;
        for (int i = 0; i < inOrder.length; i++) {
            if (rootValue == inOrder[i]) {
                rootPos = i;
                break;
            }
        }

        int leftLength = rootPos;
        int rightLength = inOrder.length - rootPos - 1;
        int[] preLeft = new int[leftLength];
        int[] inLeft = new int[leftLength];
        int[] preRight = new int[rightLength];
        int[] inRight = new int[rightLength];
        System.arraycopy(preOrder, 1, preLeft, 0, leftLength);
        System.arraycopy(preOrder, leftLength + 1, preRight, 0, rightLength);
        System.arraycopy(inOrder, 0, inLeft, 0, leftLength);
        System.arraycopy(inOrder, rootPos + 1, inRight, 0, rightLength);

        for (int i = 0; i < preLeft.length; i++) {
            int temp = preLeft[i];
            for (int j = 0; j < inLeft.length; j++) {
                if (inLeft[j] == temp)
                    break;
                if (j == inLeft.length - 1) {
                    canMake = false;
                    return null;
                }
            }
        }

        for (int i = 0; i < preRight.length; i++) {
            int temp = preRight[i];
            for (int j = 0; j < inRight.length; j++) {
                if (inRight[j] == temp)
                    break;
                if (j == inRight.length - 1) {
                    canMake = false;
                    return null;
                }
            }
        }

        root.value = rootValue;
        root.left = makeTree(preLeft, inLeft);
        root.right = makeTree(preRight, inRight);

        return root;
    }

    public static void postOrder(Node root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value + " ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            int[] preOrder = new int[n];
            int[] inOrder = new int[n];
            for (int i = 0; i < preOrder.length; i++) {
                preOrder[i] = scan.nextInt();
            }
            for (int i = 0; i < inOrder.length; i++) {
                inOrder[i] = scan.nextInt();
            }
            Node root = makeTree(preOrder, inOrder);
            if (canMake) {
                postOrder(root);
                System.out.println();
            } else {
                System.out.println("No");
                canMake = true;
            }
        }
        scan.close();
    }
}
