package 算法基础班.day01;

import java.util.Scanner;

/**
 * @author lch
 * @create 2021-09-07 下午 11:57
 * <p>
 * 1, 整数二进制打印, java中整形都是带符号位的
 * 2, 反码及补码
 * -1的二进制表示: 11111111111111111111111111111111
 * 10000000000000000000000000000000   表示什么????????????
 */
public class 二进制位打印 {

    public static void main(String[] args) {
        print(1);
        print(-1);
        print(1<<31 & -1);

//        System.out.println(0 & 1<<31);
//        pringBinary();
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println((int)(Math.pow(2, 32) - 1));
//        System.out.println(Integer.MIN_VALUE);
    }

    private static void pringBinary() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            print1(N);
        }
    }

    // 打印数字二进制位
    private static void print(int N) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((N & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    public static void print1(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & 1 << i) == 0 ? "0" : "1");
        }
    }

}
