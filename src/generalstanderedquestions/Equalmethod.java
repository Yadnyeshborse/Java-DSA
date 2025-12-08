package generalstanderedquestions;

import java.util.Objects;

public class Equalmethod {
    int id;
    String name;

    Equalmethod(int id, String name) {
        this.id = id;
        this.name = name;
    }

}

class Test{
    public static void main(String[] args) {
        Equalmethod equalmethod=new Equalmethod(1,"Raj");
        Equalmethod equalmethod1=new Equalmethod(1,"Raj");
        System.out.println(equalmethod.equals(equalmethod1));
        System.out.println(equalmethod==equalmethod1);

        //by default equal method behave like hashcode we need to override hashcode and equal method to avoid it

    }
}
