package Trees.BinaryTrees;

import java.util.Scanner;

public class BinaryTreeMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//        BinaryTrees tree=new BinaryTrees();
//        tree.populate(scanner);
//        tree.display();

        BinarySearchTree searchTree=new BinarySearchTree();
        int[] nums= {5,2,7,1,4,6,9,8,2,10};
//        searchTree.populate(nums);
//        searchTree.display();

        searchTree.populatedSorted(nums);
        searchTree.display();
        System.out.println(searchTree.isBalanced());
        searchTree.prettyDisplay();

    }
}
