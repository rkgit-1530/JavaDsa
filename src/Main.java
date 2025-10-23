import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList();
        q.add(10); q.add(20); q.add(30); q.add(40);

        System.out.println("Original Queue: " + q);

        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }


        System.out.println("Reversed Queue: " + q);
        System.out.println("Queue has been Reversed");
    }
}
