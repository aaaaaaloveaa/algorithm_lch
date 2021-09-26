package 算法基础班.day04;

/**
 * @author lch
 * @create 2021-09-22 下午 11:00
 */
public class 单链表转队列 {

    public static void main(String[] args) {
        MyQueue<Object> queue = new MyQueue<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue.pool());
        System.out.println(queue.pool());
        System.out.println(queue.pool());
        System.out.println(queue.pool());
    }

    public static class Node<V> {
        public V value;
        public Node<V> next;

        public Node(V value) {
            this.value = value;
            this.next = null;
        }
    }

    public static class MyQueue<V> {
        private Node<V> tail;
        private Node<V> head;
        private int size;

        public MyQueue() {
            this.tail = null;
            this.head = null;
            this.size = 0;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        public void offer(V value) {
            Node<V> cur = new Node<>(value);
            if (tail == null) {
                head = cur;
                tail = cur;
            } else {
                tail.next = cur;
                tail = cur;
            }
            size++;
        }

        public V pool () {
            V value = null;
            if (head != null) {
                value = head.value;
                head = head.next;
                size--;
            }
            if (head == null) {
                tail = null;
            }
            return value;
        }

        public V peek () {
            V value = null;
            if (head != null) {
                value = head.value;
            }
            return value;
        }
    }

}


