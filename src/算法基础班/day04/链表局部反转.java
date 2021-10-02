package 算法基础班.day04;

/**
 * @author lch
 * @create 2021-09-27 下午 11:54
 * 链表在K个元素范围内局部反转,不够K个的末尾元素保持不变
 * 如: 1 2 3 4 5 K=3
 * 3 2 1 4 5
 */
public class 链表局部反转 {

    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);
        Node<Integer> node4 = new Node<>(4);
        Node<Integer> node5 = new Node<>(5);
        Node<Integer> node6 = new Node<>(6);
        Node<Integer> node7 = new Node<>(7);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        print(node1);
        System.out.println("==========================分割前================================");
        int k = 3;
        Node head = segmentReverse(node1, k);
        print(head);
    }

    private static Node segmentReverse(Node<Integer> head, int k) {
        Node headNode = head;
        Node end = getLastNode(head, k);
        if ( end == null) {
            return end;
        }
        headNode = end;
        // 第一次反转
        reverse(head, end);
        while (head.next != null) {
            Node newHead = head.next;
            Node newEnd = getLastNode(newHead, k);
            if ( newEnd == null) {
                return headNode;
            }
            reverse(newHead , newEnd);
            head.next = newEnd;
            head = newHead.next;
        }
        return headNode;
    }

    public static void print(Node head){
        while (head!=null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static class Node<V> {
        public V value;
        public Node<V> next;
        public Node(V value) {
            this.value = value;
        }
    }

    /**
     * 返回K个元素内的末尾元素
     *
     * @param head 第一个元素
     * @param k    元素数
     * @return 末尾元素
     */
    public static Node getLastNode(Node head, int k) {
        while (head != null && --k > 0) {
            head = head.next;
        }
        return head;
    }

    public static void reverse(Node start, Node end) {
        end = end.next;
        Node pre = null;
        Node next = null;
        Node cur = start;
        while (cur != end) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        start.next = end;
    }
}
