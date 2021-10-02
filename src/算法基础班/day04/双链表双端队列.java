package 算法基础班.day04;

/**
 * @author lch
 * @create 2021-09-25 下午 11:39
 */
public class 双链表双端队列 {

    public static class Node<V> {
        public V value;
        public Node next;
        public Node last;

        public Node(V value) {
            this.value = value;
            this.next = null;
            this.last = null;
        }
    }

    public static class MyDeque<V> {
        private Node<V> head;
        private Node<V> tail;
        private int size;

        public MyDeque() {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        public void pushHead(V value) {
            Node cur = new Node(value);
            if (head == null) {
                head = cur;
                tail = cur;
            } else {
                cur.next = head;
                head.last = cur;
            }
            size++;
        }

        public void pushTail(V value) {
            Node cur = new Node(value);
            if (tail == null) {
                head = cur;
                tail = cur;
            } else {
                tail.next = cur;
                cur.last = tail;
            }
            size++;
        }

        public V pollHead() {
            V value = null;
            if (head != null) {
                value = head.value;
                size--;
                if (head == tail) {
                    head = null;
                    tail = null;
                } else {
                    head = head.next;
                    head.last = null;
                }
            }
            return value;
        }

        public V pollTail() {
            V value = null;
            if (tail != null) {
                value = tail.value;
                size--;
                if (head == tail) {
                    head = null;
                    tail = null;
                } else {
                    value = tail.value;

                }
            }
            return value;
        }

        public V peerHead() {
            return head == null ? null : head.value;
        }

        public V peerTail() {
            return tail == null ? null : tail.value;
        }
    }
}
