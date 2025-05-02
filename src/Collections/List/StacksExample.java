package Collections.List;

import java.util.Stack;

public class StacksExample {
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.add("Raj");
        stack.add(4);
        stack.add("Patil");
        System.out.println(stack);

        //pop= removal return and remove top element
        System.out.println(stack.pop());
        System.out.println("Remove top element=" + stack);

        //peeks
        //return top element without removal
       // stack.peek();
        System.out.println("Return top element without removal="+stack.peek());

        System.out.println("Search element="+stack.search(4));
    }
}
