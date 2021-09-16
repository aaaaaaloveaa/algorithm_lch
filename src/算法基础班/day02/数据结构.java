package 算法基础班.day02;

/**
 * @author lch
 * @create 2021-09-12 下午 8:09
 * <p>
 * 1,数组查询较快,因为可以使用偏移量,但是增删慢
 * 2,链表查询较慢,但是增删快
 * <p>
 * 例题1:给定一个数组, 求[L,R]上的累加和, 当查询非常频繁时,以下方案
 * 1,前缀和,一位数组
 * 2,二维数组,直接求和
 * 例题2: 给定一个函数f,等概率返回[3~7],在只能使用该函数的条件下, 等概率返回[1~7]
 * 思路: 将任何给定的函数,做成01等概率函数,在通过二进制返回0到X的等概率.
 * 给定一个函数0:p  1:1-p, 如何做到01denggail
 * <p>
 * 对数器: 模拟测试场景的数据,循环测试N次, 如: 长度为Length,每个数都为MaxValue的数组
 */
public class 数据结构 {
    public static void main(String[] args) {
        int N = 1000000;
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (x() == 0) {
                count++;
            }
        }
        System.out.println((double) count / N);

        System.out.println("=======================");
        count = 0;
        for (int i = 0; i < N; i++) {
            if (y() == 0) {
                count++;
            }
        }
        System.out.println((double) count / N);
    }

    public static int y() {
        int ans = -1;
        do {
            ans = x();
        } while (ans == x());
        return ans;
    }

    public static int x() {
        return Math.random() < 0.85 ? 0 : 1;
    }
}
