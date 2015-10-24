import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 * Created by Adarsh on 10/20/2015.
 */

class StackX {

    private int top;
    private int stackSize;
    private char[] stackArray;

    public StackX(int size){

        stackSize = size;
        top = -1;
        stackArray = new char[stackSize];
        //stackArray;
    }

    public boolean isEmpty(){
        return (top == -1);

    }

    public boolean isFull(){
        return (top == stackSize);

    }

    public char pop(){
        return stackArray[top--];
    }

    public void push(char item){
        stackArray[++top] = item;
    }

    public char seek(){
        return stackArray[top];
    }


}

class Reverse{

    private String inputString;
    private String outputString;

    public Reverse(String s){
        inputString = s;
        outputString = "";

    }
    public String doReverse(){


        StackX stack = new StackX(inputString.length());

        for(int i = 0; i<inputString.length();i++) {
            stack.push(inputString.charAt(i));
        }

        while(!stack.isEmpty()){

            outputString += stack.pop();
        }



        return outputString;
    }
}


public class StackReverse {

   public static void main(String[] args)throws IOException {
       System.out.println("Enter a String: ");
       InputStreamReader isr  = new InputStreamReader(System.in);
       BufferedReader br = new BufferedReader(isr);
       String s = br.readLine();

       //StackX stack = new StackX(s.length());
       Reverse rev = new Reverse(s);
       String reversedString  = rev.doReverse();
       System.out.println("Reversed String is : "+reversedString);
    }
}


