package string;

public class InternMethod {
    public static void main(String[] args) {
        String s1 = "pankaj";
        String s2 = "pankaj";
        String s3 = new String("pankaj");

        System.out.println(s1==s2);//true
        System.out.println(s2==s3);//false

        String s4 = s3.intern();
        System.out.println(s1==s4);//true


//        String s1 = "hello";                     // string literal → goes into pool
//        String s2 = new String("hello");         // new object in heap (not pooled)
//        String s3 = s2.intern();                 // returns reference from pool
//
//        System.out.println(s1 == s2); // ❌ false (different references)
//        System.out.println(s1 == s3); // ✅ true  (both refer to pooled "hello")
//        s1 → refers to the literal "hello" in the string pool.
//        s2 → explicitly creates a new object on the heap, not in the pool.
//        s2.intern() → checks the pool:
//        "hello" is already there (because of s1), so it returns that reference.
//        So s3 == s1 → true.
    }
}
