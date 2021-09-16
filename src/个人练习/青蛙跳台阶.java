package 个人练习;

import java.util.Scanner;

/**
 * @author lch
 * @create 2021-09-12 上午 10:28
 */
public class 青蛙跳台阶 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = Integer.parseInt(scanner.nextLine());
            int[] arr = new int[N+1];
            System.out.println(getNum(N, arr));
        }
    }

    private static int getNum(int n, int[] arr) {
        if (n <= 2) {
            return n;
        }
        if (arr[n] != 0) {
            return arr[n];
        } else {
            arr[n] = getNum(n-1, arr) + getNum(n-2, arr);
            return arr[n];
        }
    }
}
