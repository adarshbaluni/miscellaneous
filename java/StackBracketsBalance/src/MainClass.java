/**
 * Created by Adarsh on 10/23/2015.
 */
import java.io.*;



class StackX{

    private char[] stackArray;
    private int size;
    private int top;

    public StackX(int s){
        size = s;
        stackArray = new char[s];
        top = -1;

    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == size;
    }

    public char pop(){
        return stackArray[top--];
    }

    public void push(char s){
        stackArray[++top] = s;
    }

}

class Bracket{

    private String inputString ;
    StackX stackObj;
    public Bracket(String s){
        inputString = s;
        stackObj = new StackX(inputString.length());

    }

    public boolean checkForBalance(){
        for(int i = 0; i<inputString.length(); i++){
            if(inputString.charAt(i) == '(' || inputString.charAt(i) == '[' || inputString.charAt(i) == '{' )
                stackObj.push(inputString.charAt(i));
            else{
                if(inputString.charAt(i) == ')'){
                    if(!(stackObj.pop() == '(') || stackObj.isEmpty())
                        return false;

                }

                if(inputString.charAt(i) == ']' ){
                    if(!(stackObj.pop() == '[') || stackObj.isEmpty())
                        return false;

                }

                if(inputString.charAt(i) == '}'){
                    if(!(stackObj.pop() == '{') ||  stackObj.isEmpty())
                        return false;

                }
            }

        }
        return true;
    }


}

public class MainClass {
    public static void main(String[] args) throws IOException {
        System.out.println("\n Enter a sequence: ");
        System.out.flush();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String inputSequence = br.readLine();

        Bracket bracket = new Bracket(inputSequence);
        boolean result = bracket.checkForBalance();

        if(result)
            System.out.print("\nBALANCED");
        else
            System.out.print("\nNOT BALANCED");

    }

}
