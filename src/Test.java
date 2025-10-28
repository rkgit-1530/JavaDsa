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
        list.insert(46);
        list.insert(56);
        list.insert(96);
        list.find(46);
        list.find(30);
        list.Display();
    }
}
