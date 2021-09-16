package 个人练习;

/**
 * @author lch
 * @create 2021-09-07 上午 9:52
 */
public class 选最大牌 {

    public static void main(String[] args) {
        // 100,1,1
        // 1,100,1
        int[] arr = {1,100,99,2};
        int first = f(arr, 0, arr.length-1);
        int second = p(arr, 0, arr.length-1);
        System.out.println(first);
        System.out.println(second);
    }

    public static int f(int[] arr, int L, int R) {
        if ( L == R) {
            return arr[L];
        }
        int L1 = arr[L] + p(arr, L+1, R);
        int L2 = arr[R] + p(arr, L, R-1);
        System.out.println("先:" + Math.max(L1, L2));
        return Math.max(L1, L2);
    }

    private static int p(int[] arr, int L, int R) {
        if ( L == R ) {
            return 0;
        }
        int p1 = f(arr, L+1, R);
        int p2 = f(arr, L, R-1);
        System.out.println("后:" + Math.min(p1, p2));
        return Math.min(p1, p2);
    }
}
