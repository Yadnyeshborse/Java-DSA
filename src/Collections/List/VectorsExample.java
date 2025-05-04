package Collections.List;

import java.util.Vector;

public class VectorsExample {
    public static void main(String[] args) {
        Vector vector=new Vector();
        vector.add(1);
        vector.add(2);
        vector.add("geeks");
        vector.add("of");
        System.out.println(vector);

        //update
        vector.set(1,"Mau");
        System.out.println("Update "+ vector);

        //remove
        vector.remove(Integer.valueOf(1));
        System.out.println(vector);
    }
}
