/**
 * Created by Adarsh on 10/23/2015.
 */

//import java.io.*;

class QueueArray{

    private int size;
    private int[] Q;
    private int numberOfItems;
    private int rear;
    private int front;

    public QueueArray(int number){
        numberOfItems = 0;
        rear = -1;
        front = 0;
        Q = new int[number];
        size = number;
    }

    public void insert(int item){
        if(numberOfItems >= size){

            System.out.println("Cannot add more. the queue is full");
        }

        else {
            if (rear == size - 1)
                rear = -1;
            Q[++rear] = item;
            numberOfItems++;
        }

    }

    public int deque(){
        numberOfItems--;
        return Q[front++];

    }

    public boolean isFull(){
        return numberOfItems == size;
    }

    public boolean isEmpty(){
        return numberOfItems == 0;
    }

    public void printAll(){
        for(int i=0; i<size ;i++){
            System.out.println(Q[i]+" ");
        }
    }

}


public class QueueMain {
    public static void main(String[] args) {
        QueueArray que = new QueueArray(5);
        System.out.println(que.isEmpty());
        System.out.println(que.isFull());

        que.insert(10);
        que.insert(20);
        que.insert(30);
        que.insert(40);
        que.insert(50);

        System.out.println(que.isEmpty());
        System.out.println(que.isFull());

        System.out.println(que.deque());

        System.out.println(que.isEmpty());
        System.out.println(que.isFull());

        que.insert(60);
        que.insert(70);
        que.insert(80);

        System.out.println(que.isEmpty());
        System.out.println(que.isFull());

        que.printAll();





    }
}
