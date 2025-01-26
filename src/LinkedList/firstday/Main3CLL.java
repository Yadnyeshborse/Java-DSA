package LinkedList.firstday;

public class Main3CLL {
    public static void main(String[] args) {
        CLL cll=new CLL();
        cll.insert(1);
        cll.insert(2);
        cll.insert(3);
        //cll.delete(3);
        cll.display();
        System.out.println(cll.hasCycle());
        System.out.println("Cycle Length: " + cll.findCycleLength());
        System.out.println(cll.findSquare(9));
        System.out.println("Find Happy Number="+cll.happyNumber(19));

    }
}
