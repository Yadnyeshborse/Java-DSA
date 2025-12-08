package generalstanderedquestions;

public class CloneCopyObjectShallowCopy implements Cloneable{
    String city;

    public CloneCopyObjectShallowCopy(String city) {
        this.city = city;
    }


    @Override
    public CloneCopyObjectShallowCopy clone() throws CloneNotSupportedException {
        try {
            CloneCopyObjectShallowCopy clone = (CloneCopyObjectShallowCopy) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new CloneNotSupportedException();
        }
    }

}

class ClassTwo implements Cloneable {
    int id;
    String name;
    CloneCopyObjectShallowCopy address;  // reference type

    ClassTwo(int id, String name, CloneCopyObjectShallowCopy address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();  // ❌ shallow copy (address is shared)
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneCopyObjectShallowCopy object=new CloneCopyObjectShallowCopy("Mumbai");
        ClassTwo obj1=new ClassTwo(101,"Raj",object);

        ClassTwo obj2=(ClassTwo) obj1.clone();

        object.city="Pune";
        System.out.println("original= "+obj1.address.city);
        System.out.println("copied= "+obj2.address.city);


    }
}
