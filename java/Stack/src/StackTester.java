/**
 * Created by Adarsh on 11/20/2015.
 */
public class StackTester {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.printStackItems();


        stack.pop();
        stack.pop();

        stack.printStackItems();

        stack.push(100);
        stack.push(99);
        stack.printStackItems();
    }


}


class Stack{

    int sizeOfArray;
    int top;
    int[] array;


    Stack(int size){
        array = new int[size];
        top = -1;
        sizeOfArray = size;
    }

    public void push(int item){
        if(!isFull()){
            array[++top] = item;
        }

    }

    public void pop(){

        if(!isEmpty()){
            System.out.println(array[top--] + " has been removed from stack") ;
        }

    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isFull(){
        if(top == sizeOfArray-1){
            return true;
        }
        else {
            return false;
        }
    }

    public void printStackItems(){
        for(int i=0; i<top+1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }
}