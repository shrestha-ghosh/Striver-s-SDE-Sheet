import java.util.Stack;

class Node {
    int data;      
    Node next;     

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class reverseLi{

    public static Node reverseLinkedListt(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseLinkedListt(head.next);

        Node front = head.next;

        front.next = head;

        head.next = null;

        return newHead;
    }

    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);

        System.out.print("Original Linked List: ");
        printLinkedList(head);
        head = reverseLinkedListt(head);

        System.out.print("Reversed Linked List: ");
        printLinkedList(head);
    }
}


