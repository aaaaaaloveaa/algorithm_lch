package 个人练习;

/**
 * @author lch
 * @create 2021-09-05 下午 9:11
 */
public class Test01 {

    public static void main(String[] args) {

        String a = "aaa";
        System.out.println(a);
        changeA(a);
        System.out.println(a);
    }

    private static void changeA(String a) {
        a += "bbbb";
    }

}
