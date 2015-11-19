//import LinkedList;


public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.head = new Node(10);
        linkedList.addNode(20);
        linkedList.addNode(30);
        linkedList.addNode(50);

        Node temp = linkedList.head;
        while(temp.next != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println(temp.data);

        System.out.println("\n 1");

        linkedList.addNode(40,30);
//-------------------------------------------------
        System.out.println("\n 2");

        temp = linkedList.head;

        while(temp.next != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println(temp.data);
        //first.head =n

    }
}


// 10 --> 20 --> 30 --> 40 --> 50 --> null

class LinkedList {

    Node head;

    public LinkedList(){
        head = null;
    }

    public void addNode(int d){
        Node temp = head;
        while(temp.next != null){

            temp = temp.next;
        }
        temp.next = new Node(d);
       // temp.next.next = null;
        return ;

    }

    public void addNode(int d, int after){
        Node temp = head;

        while(temp.data !=  after){

            temp = temp.next;
        }
        Node new_node = new Node(d);
        new_node.next = temp.next;
        temp.next = new_node;
       // temp.next.next = null;
        return;
    }

}


class Node {
    int data;
    Node next;

    public Node(int d) {
        data = d;
        next = null;
    }
}

