package 算法基础班.day04;

/**
 * 单链表反转
 *
 * @author lch
 * @create 2021-09-16 下午 10:13
 */
public class 链表问题 {
    public static void main(String[] args) {
        SingleNode head = new SingleNode(1);
        head.next = new SingleNode(2);
        head.next.next = new SingleNode(3);
        print(head);
        SingleNode node2 = revert(head);
        System.out.println("==================");
        print(node2);
    }

    public static void print(SingleNode node) {
        while (node != null) {
            System.out.println(node.val + " ");
            node = node.next;
        }
    }

    // 链表反转
    public static SingleNode revert(SingleNode head) {
        SingleNode pre = null;
        SingleNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
