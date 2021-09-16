package 算法基础班.day04;

/**
 * @author lch
 * @create 2021-09-16 下午 10:13
 */
public class 链表问题 {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        print(head);
        Node node2 = revert(head);
        System.out.println("==================");
        print(node2);
    }

    public static void print(Node node) {
        while (node!=null) {
            System.out.println(node.val + " ");
            node = node.next;
        }
    }

    // 链表反转
    public static Node revert(Node head) {
        Node pre = null;
        Node next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}

class Node {
    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
    }
}
