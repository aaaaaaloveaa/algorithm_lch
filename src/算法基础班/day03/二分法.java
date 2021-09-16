package 算法基础班.day03;

/**
 * @author lch
 * @create 2021-09-12 下午 10:50
 */
public class 二分法 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5, 9};
        int num = 8;
        // System.out.println(binarySeek(arr, num));
        System.out.println(mostLeft(arr, num));
        System.out.println(mostRight(arr, num));
    }

    // <= num 最右
    public static int mostRight(int[] arr, int num) {
        int L = 0;
        int R = arr.length - 1;
        int ans = -1;
        while (L <= R) {
            int midIndex = (L + R) / 2;
            if (arr[midIndex] > num) {
                R = midIndex - 1;
            } else {
                ans = arr[midIndex];
                L = midIndex + 1;
            }
        }
        return ans;
    }

    // >= num 最左
    public static int mostLeft(int[] arr, int num) {
        int L = 0;
        int R = arr.length - 1;
        int ans = -1;
        while (L <= R) {
            int midIndex = (L + R) / 2;
            if (arr[midIndex] >= num) {
                ans = arr[midIndex];
                R = midIndex - 1;
            } else {
                L = midIndex + 1;
            }
        }
        return ans;
    }

    public static boolean binarySeek(int[] arr, int num) {
        boolean flag = false;
        int L = 0;
        int R = arr.length - 1;
        while (L <= R) {
            int midIndex = (L + R) / 2;
            if (arr[midIndex] == num) {
                flag = true;
                break;
            } else if (arr[midIndex] > num) {
                R = midIndex - 1;
            } else {
                L = midIndex + 1;
            }
        }
        return flag;
    }
}
