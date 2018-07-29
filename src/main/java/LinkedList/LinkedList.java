package LinkedList;

public class LinkedList {

    private static  Node head;
    private int size;

    public LinkedList(Object data) {
        head = new Node(data);
    }

public void addTail (Object data){
        Node copy = head;
        while (copy.next != null) {
            copy = copy.next;
        }
        copy.next = new Node(data);
        size++;
        }

    public void add(Object data){
        Node copy = head;
        head = new Node(data);
        head.next = copy;
        size ++;
    }

    public static void printList(){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
    public static Object get(int index){
        Node temp = head;
        int i = 0;
        while (i<index-1){
            temp = temp.next;
            i++;
        }
        return temp.data;
    }


    class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }
}
