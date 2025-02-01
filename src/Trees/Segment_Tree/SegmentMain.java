package Trees.Segment_Tree;

public class SegmentMain {
    public static void main(String[] args) {

        int[] arr = {3, 8, 6, 7, -2, -8, 4, 9};
        Segment segment=new Segment(arr);
        System.out.println(segment.query(1, 6));
        //segment.display();
        
    }
}
