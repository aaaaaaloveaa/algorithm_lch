package 个人练习;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lch
 * @create 2021-09-08 下午 11:35
 */
public class 子序列 {

    public static void main(String[] args) {
        String str = "abc";
        subString(str);
    }

    private static void subString(String str) {
        char[] arr = str.toCharArray();
        List<String> arrList = new ArrayList<>();
        for (char c : arr) {
            arrList.add(String.valueOf(c));
        }
        ArrayList<String> res = new ArrayList<>();
        String plan = "";
        f(arrList, 0, plan, res);
        System.out.println(res);
    }

    public static void f(List<String> arr, int index, String plan, List<String> list) {
        if (arr.size() == index) {
            if (plan != null && "" != plan) {
                System.out.println(plan);
                list.add(plan);
            }
            return;
        }
        String str = arr.get(index);
        index++;
        f(arr, index, plan, list);
        f(arr, index, plan + str, list);
    }
}
