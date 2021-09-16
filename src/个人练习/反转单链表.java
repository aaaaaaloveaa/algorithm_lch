package 个人练习;

/**
 * @author lch
 * @create 2021-09-12 上午 10:10
 */
public class 反转单链表 {

    public static void main(String[] args) {
        Node node4 = new Node(4, null);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);
        printNode(node1);
        revert(node1);
        System.out.println("=======================");
        printNode(node4);
    }

    private static Node revert(Node node1) {
        if (node1.next == null) return node1;
        Node nextNode = revert(node1.next);
        nextNode.next = node1;
        node1.next = null;
        return node1;
    }

    private static void printNode(Node node1) {
        if (node1 == null) return;
        System.out.println(node1.num);
        node1 = node1.next;
        printNode(node1);
    }

}

class Node {
    public int num;
    public Node next;

    public Node(int num, Node next) {
        this.num = num;
        this.next = next;
    }
}
