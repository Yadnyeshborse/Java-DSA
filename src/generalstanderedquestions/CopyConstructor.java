package generalstanderedquestions;

public class CopyConstructor {
    int id;
    String name;

    public CopyConstructor(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public CopyConstructor(CopyConstructor copyConstructor) {
        this.id = copyConstructor.id;
        this.name = copyConstructor.name;
    }
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        CopyConstructor copyConstructor=new CopyConstructor(101, "Rahul");
        CopyConstructor copyConstructor1=new CopyConstructor(copyConstructor);
        copyConstructor.display();
        copyConstructor1.display();
    }
}
