package LinkedList.firstday;

public class Main {
    public static void main(String[] args) {
        LL obj=new LL();
        obj.insertNext(1);
        obj.insertNext(2);
        obj.insertNext(3);
        obj.insertNext(4);
        obj.insertNext(5);
        obj.inserLast(7);
        obj.display();
        obj.insert(5,2);
        obj.display();
        obj.deleteFirst();
        obj.display();
        obj.deleteLast();
        obj.display();
        obj.delete(3);
        obj.display();
        obj.find(5);
        obj.first(90);
        obj.display();
    }
}
