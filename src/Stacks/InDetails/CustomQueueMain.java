package Stacks.InDetails;

public class CustomQueueMain {
    public static void main(String[] args) throws Exception{
        CustomQueue queue=new CustomQueue(5);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);

        queue.display();
        System.out.println("Removing element="+queue.remove());
        queue.display();


    }
}
