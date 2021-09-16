package 算法基础班.day03;

/**
 * @author lch
 * @create 2021-09-14 下午 11:31
 */
public class 时间复杂度 {
    /**
     * 对于每一次的实际计算,时间固定,对于总次数结果,只保留最高次的数,即为时间复杂度
     * 对于java中的List的扩容,时间复杂度为O(N),均摊到每个上,为O(1)
     */
    public static void main(String[] args) {
        Integer a = 11111111;
        Integer b = 11111111;
        int h1 = a.hashCode();
        int h2 = a.hashCode();
        System.out.println(h1);
        System.out.println(h2);
        System.out.println("aaa".hashCode());
    }
}
