/**
 * Created by Adarsh on 11/15/2015.
 */
public class LinkedList {

    Node head;

    class Node{
        int data;
        Node next;

        public Node(int d){
            data = d;
            next = null;
        }

        public void push(int d){

            Node new_node = new Node(d);
            new_node.next = head;
            head = new_node;

        }


        public void append(int d){
            Node new_node = new Node(d);

            if(head == null){
                head = new_node;
                return;
            }

            new_node.next = null;

            Node last = head;
            last = head;

            while(last.next != null){
                last = last.next;
            }

            last.next = new_node;
            return;
        }

        public void insertAfter(int prevData, int data){
            Node new_node = new Node(30);

            if(head == null){
                head = new_node;
                return;
            }

            Node prev = head;

            while(prev.data !=  prevData ){
                prev = prev.next;
            }

            new_node.next = prev.next;
            prev.next = new_node;

            return;


        }

    }
}
