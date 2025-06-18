import java.util.*;

public class Stack1
{
    public static void main(String[] args) 
{

        Stack stack = new Stack();

        
        stack.add("Apple");
        stack.add("Banana");
        stack.add("Cherry");

        System.out.println("Stack: " + stack);

        
        System.out.println("Top element (peek): " + stack.peek());

        
        System.out.println("Popped element: " + stack.pop());

        
        System.out.println("Stack after pop: " + stack);

        
        System.out.println("Is the stack empty? " + stack.isEmpty());
    }
}