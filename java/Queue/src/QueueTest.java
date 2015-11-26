/**
 * Created by Adarsh on 11/21/2015.
 */
public class QueueTest {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.addItem(1);
        q.addItem(2);
        q.addItem(3);
        q.addItem(4);
        q.addItem(5);

        q.printArray();

        System.out.println("\n");

        q.delete();
        q.delete();

        q.printArray();
        System.out.println("\n");

        q.addItem(6);
        q.addItem(7);

        q.printArray();


    }
}

class Queue{

    int front;
    int rear;
    int[] queue;
    int noOfItems;
    int sizeofQ;

    public Queue(int size){
        noOfItems = 0;
        sizeofQ = size;
        front = 0;
        rear = 0;
        queue = new int[size];

    }

    public void addItem(int item){
        if(!isFull()){
            queue[rear++] = item;
            if(rear == sizeofQ){
                rear = 0;
            }
            noOfItems++;
        }
    }
    public void delete(){
        if(!isEmpty()){
            front++;
            if(front == sizeofQ){
                front = -1;
            }
            noOfItems--;
        }
    }

    public boolean isFull(){
        return(noOfItems == sizeofQ);
    }

    public boolean isEmpty(){
        return(noOfItems == 0);
    }

    public void printArray(){
        for(int i = 0; i< noOfItems ; i++)
        System.out.println(queue[(noOfItems-1 + i) % queue.length]);

    }
}
