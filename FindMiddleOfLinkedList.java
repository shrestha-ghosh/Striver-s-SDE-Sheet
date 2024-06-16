import java.util.*;

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
public class FindMiddleOfLinkedList {
    static Node findMiddle(Node head) {
        Node slow = head; 
        Node fast = head;   

        // Traverse the linked list using
        // the Tortoise and Hare algorithm.
        while (fast != null && fast.next != null && slow != null) {
            // Move fast two steps.
            fast = fast.next.next;  
            // Move slow one step.
            slow = slow.next;        
        }

        return slow;  
    }


    public static void main(String[] args) {
        // Creating a sample linked list:
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node middleNode = findMiddle(head);

        // Display the value of the middle node
        System.out.println("The middle node value is: " + middleNode.data);
    }
}
