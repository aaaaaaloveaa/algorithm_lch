package 算法基础班.day04;

/**
 * @author lch
 * @create 2021-09-22 下午 10:58
 */
public class 双链表反转 {
    public static void main(String[] args) {
        DouNode node1 = new DouNode(1);
        DouNode node2 = new DouNode(2);
        DouNode node3 = new DouNode(3);

        node1.next = node2;
        node2.next = node3;

        node2.pre = node1;
        node3.pre = node2;
        printNext(node1);
        System.out.println("=========前========");
        printPre(node3);
        System.out.println("------------------------------------------------");

        DouNode node = revertNode(node1);
        printNext(node);

    }

    private static DouNode revertNode(DouNode head) {
        DouNode pre = null;
        DouNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            head.pre = next;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static void printNext(DouNode head) {
        if (head != null) {
            System.out.println(head.val);
            head = head.next;
            printNext(head);
        }
    }

    public static void printPre(DouNode head) {
        if (head != null) {
            System.out.println(head.val);
            head = head.pre;
            printPre(head);
        }
    }
}

// 双链表
class DouNode {
    public Integer val;
    public DouNode pre;
    public DouNode next;

    public DouNode(Integer val) {
        this.val = val;
    }
}
