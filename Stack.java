import java.util.Stack;
public class stack
{
public static void main (String args [])
{
Stack<Integer> stk = new Stack<>(); // also can use add method 
stk.push(1);
stk.push(2);
System.out.println(stk.peek());
stk.pop();
System.out.println(stk);
}
}