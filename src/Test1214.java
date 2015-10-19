import java.util.Scanner;

public class Test1214 {

    /**
     * @param args
     */
    // this method is clear but not effective !
    // public static boolean isUgly(int number) {
    // while (number % 2 == 0)
    // number /= 2;
    // while (number % 3 == 0)
    // number /= 3;
    // while (number % 5 == 0)
    // number /= 5;
    // if (number == 1)
    // return true;
    // else
    // return false;
    // }
    public static void createUgly(int index) {
        int[] nums = new int[index];
        nums[0] = 1;
        int index2 = 0, index3 = 0, index5 = 0;
        int next = 1;

        while (next < index) {
            nums[next] = getMin(nums[index2] * 2, nums[index3] * 3,
                    nums[index5] * 5);
            while (nums[index2] * 2 <= nums[next])
                index2++;
            while (nums[index3] * 3 <= nums[next])
                index3++;
            while (nums[index5] * 5 <= nums[next])
                index5++;
            next++;
        }

        // System.out.println(Arrays.toString(nums));
        System.out.println(nums[index - 1]);
    }

    public static int getMin(int a, int b, int c) {
        int min = a;
        if (min > b)
            min = b;
        if (min > c)
            min = c;
        return min;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            createUgly(n);
        }
        scan.close();
    }
}
