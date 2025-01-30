package Trees.AVL_Tree;

import java.util.Scanner;

public class AVL_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
          AVL_TREE tree = new AVL_TREE();
        tree.populateSorted(nums);
       tree.prettyDisplay();
       System.out.println(tree.height());
       System.out.println("Result == " + tree.isBalanced());

//        for(int i=0; i < 1000; i++) {
//            tree.populateSorted(i);
//        }

        //System.out.println(tree.height());
       // tree.prettyDisplay();
        //System.out.println("result="+tree.isBalanced());


    }
}
