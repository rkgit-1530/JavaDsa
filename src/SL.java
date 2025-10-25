//// Step 1: Create a Node class (Blueprint for each element)
//class Node {
//    int data;   // value inside the node
//    Node next;  // reference to next node
//
//    // Constructor to create a new node
//    Node(int data) {
//        this.data = data;
//        this.next = null; // next is null when node is created
//    }
//}
//
//// Step 2: Create a LinkedList class
//class LinkedList {
//    Node head; // head points to the first node in the list
//
//    // Add element at the end
//    void add(int data) {
//        Node newNode = new Node(data);  // create new node
//        if (head == null) {             // if list is empty
//            head = newNode;             // first node becomes head
//            return;
//        }
//        Node current = head;            // start from head
//        while (current.next != null) {  // move until we reach last node
//            current = current.next;
//        }
//        current.next = newNode;         // link last node to new node
//    }
//
//    // Delete a node by value
//    void delete(int key) {
//        if (head == null) return;            // if list empty
//
//        if (head.data == key) {              // if head needs to be deleted
//            head = head.next;
//            return;
//        }
//
//        Node current = head;
//        while (current.next != null && current.next.data != key) {
//            current = current.next;
//        }
//
//        if (current.next == null) {
//            System.out.println("Element not found");
//            return;
//        }
//
//        current.next = current.next.next;    // unlink the node
//    }
//
//    // Print all nodes
//    void printList() {
//        Node current = head;
//        while (current != null) {
//            System.out.print(current.data + " -> ");
//            current = current.next;
//        }
//        System.out.println("null");
//    }
//}
//
//// Step 3: Test the LinkedList
//public class SL {
//    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//
//        System.out.println("Initial List:");
//        list.printList();
//
//        list.delete(20);
//        System.out.println("After Deleting 20:");
//        list.printList();
//        list.delete(10);
//        System.out.println("After Deleting 10:");
//        list.printList();
//
//        list.add(40);
//        System.out.println("After Adding 40:");
//        list.printList();
//    }
//}
