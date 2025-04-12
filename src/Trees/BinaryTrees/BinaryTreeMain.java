package Trees.BinaryTrees;

import java.util.Scanner;

public class BinaryTreeMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//        BinaryTrees tree=new BinaryTrees();
//        tree.populate(scanner);
//        tree.display();

        BinarySearchTree searchTree=new BinarySearchTree();
        int[] nums= {5,2,7,1,4,6,9,8,10};
        searchTree.populate(nums);
        searchTree.display();

//        searchTree.populatedSorted(nums);    //use if tree is sorted
//        searchTree.display();
        System.out.println("Is Tree Balancled="+searchTree.isBalanced());
        searchTree.prettyDisplay();

    }
}
