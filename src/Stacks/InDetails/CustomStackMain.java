package Stacks.InDetails;

public class CustomStackMain {
    public static void main(String[] args) throws StackCustomException {
       // CustomStack stack=new CustomStack(5);
        DynamicStack stack1=new DynamicStack(6);
        stack1.push(6);
        stack1.push(11);
        stack1.push(15);
        stack1.push(18);

//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());   //custom exception

        //by dynamic stack
        System.out.println("By Dymanic Exception "+ stack1.pop());
        System.out.println("By Dymanic Exception "+ stack1.pop());
        System.out.println("By Dymanic Exception "+ stack1.pop());


    }
}
