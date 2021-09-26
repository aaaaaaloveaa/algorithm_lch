package 算法基础班.day04;

/**
 * @author lch
 * @create 2021-09-25 下午 6:45
 */
public class Node {
    private int val;
    private Node next;

    public Node(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
