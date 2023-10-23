
// Java code to implement the approach
import java.io.*;
import java.util.*;

// BST node
class TreeNode {
    int val;
    TreeNode left, right;
}

class GFG {

    // Build a new node
    static TreeNode newNode(int data) {
        TreeNode temp = new TreeNode();

        temp.val = data;
        temp.left = null;
        temp.right = null;

        return temp;
    }

    // Function to insert a new node
    static TreeNode insert(TreeNode root, int val) {
        TreeNode newnode = newNode(val);
        TreeNode x = root;
        TreeNode y = null;

        while (x != null) {
            y = x;
            if (val < x.val) {
                x = x.left;
            } else {
                x = x.right;
            }
        }

        if (y == null) {
            y = newnode;
        } else if (val < y.val) {
            y.left = newnode;
        } else {
            y.right = newnode;
        }
        return y;
    }

    // Function for performing inorder traversal of BST
    static void inorder(List<Integer> inord, TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(inord, root.left);
        inord.add(root.val);
        inorder(inord, root.right);
    }

    // Function to search a element in the BST
    static boolean BSTSearch(List<Integer> inord,
            int target) {
        return inord.contains(target);
    }

    static void printArr(int N, int[] targets,
            List<Integer> inorder) {
        for (int i = 0; i < N; i++) {
            if (BSTSearch(inorder, targets[i])) {
                System.out.println("Found");
            } else {
                System.out.println("Not Found");
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = null;
        root = insert(root, 8);
        insert(root, 15);
        insert(root, 4);
        insert(root, 7);
        insert(root, 1);
        insert(root, 6);
        insert(root, 5);

        // BST Inorder - sorted array
        List<Integer> inor = new ArrayList<>();
        inorder(inor, root);

        int[] targets = { 6, 2, 7, 4, 5, 1, 3 };
        int N = targets.length;

        printArr(N, targets, inor);
    }
}