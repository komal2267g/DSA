public class BasicLinkedList {
    // Node class
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Method to connect node at the start
    public void connectFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Method to connect node at the end
    public void connectLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Method to print the linked list
    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void add(int idx, int data) {
        Node newNode = new Node(data);
        size++;

        // Add at index 0
        if (idx == 0) {
            newNode.next = head;
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
            return;
        }
        Node temp = head;
        int i = 0;
        while (temp != null && i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // Handle invalid index
        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }

        // Insert new node
        newNode.next = temp.next;
        temp.next = newNode;

        // Update tail if added at the end
        if (newNode.next == null) {
            tail = newNode;
        }
    }
    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail= null;
            size = 0;
            return val;
        }
        int val= head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev =head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size --;
        return val;
    }
    public int itrSearch(int key){
        Node temp = head;
        int i = 0;

        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public static void main(String[] args) { 
        BasicLinkedList ll = new BasicLinkedList ();       
        ll.print();                    
        ll.connectFirst(2);
        ll.print();
        ll.connectFirst(1);
        ll.print();
        ll.connectFirst(3);
        ll.print();
        ll.connectLast(4);
        ll.print();
        ll.add(2,9);
        ll.print();
        System.out.println("Size of Linked List: " + ll.size);
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println("Index of 9: " + ll.itrSearch(9));
        System.out.println("Index of 10: " + ll.itrSearch(10));
    }
}
