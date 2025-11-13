class Node {
    int data;
    Node next;


    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

    class Linkedlist{
        Node head;
        int size=0;

        void insert(int value){
            Node newNode = new Node(value);
            if(head==null){
                head=newNode;
                return;
            }
            Node current = head;
            while (current.next !=null){
                current=current.next;
            }
            current.next=newNode;
            size++;
            System.out.println("New Value "+newNode.data+" added");
            System.out.println("Size of the linkedlist is "+size);
        }
        void insertAtIndex(int index, int value) {
            if (index < 0 || index > size) {
                System.out.println("Invalid index!");
                return;
            }

            // If inserting at the start
            if (index == 0) {
                insertFirst(value);
                return;
            }

            // If inserting at the end
            if (index == size) {
                insert(value);
                return;
            }

            // Otherwise, somewhere in the middle
            Node newNode = new Node(value);
            Node prev = head;

            // Move to (index - 1) position
            for (int i = 1; i < index; i++) {
                prev = prev.next;
            }

            // Adjust links
            newNode.next = prev.next;
            prev.next = newNode;
            size++;

            System.out.println("Inserted " + value + " at index " + index);
        }
        void insertFirst(int value) {
            Node newNode = new Node(value);
            if (head != null) {
                newNode.next = head; // step 2: new node points to old head
            }
            head = newNode;
            size++;
            System.out.println("Inserted " + value + " at the beginning.");
        }
        void Display(){
            Node current = head;
            while (current!=null){
                System.out.print(current.data+" -> ");
                current=current.next;
            }
            System.out.println("Null");
        }
        void DeleteFirst(){
            int val = head.data;
            head=head.next;
            System.out.println("Deleted First Value: "+val);
        }
        void DeleteLast(){
            if(head==null){
                System.out.println("List is Empty");
                return;
            }
            if(head.next==null){
                head=null;
                return;
            }
            Node current = head;
            while(current.next.next!=null){
                current=current.next;
            }
            System.out.println(current.next.data+" has been Removed");
            current.next=null;

        }
        void delete(int index){
            if(index==0){
                DeleteFirst();
                return;
            }
            if(index==size-1){
                DeleteLast();
                return;
            }
            Node prev = get(index-1);
            int val=prev.next.data;
            System.out.println(val+" Has been Removed");
            prev.next=prev.next.next;
        }
        Node get(int index){
            Node node = head;
            for (int i = 0; i < index; i++) {
                node=node.next;
            }
            return node;
        }
        void find(int value){
            Node node = head;
            while (node!=null){
                if(node.data==value){
                    System.out.println("Node at"+ node);
                }
                node=node.next;

            }

        }

    }





public class Test {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.insert(20); //  30 56 96
        list.insert(30);
        list.insertFirst(50);
        list.insertAtIndex(2,10);
        list.insertAtIndex(0,24);
        list.insertAtIndex(1,55);
        list.insertAtIndex(2,65);
        list.Display();
    }
}
