

import java.util.*;

public class height {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int index = -1;

        public static Node BuildTree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);

            return newNode;
        }



    }
    public static int height(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);

        int totalheight=Math.max(leftheight,rightheight)+1;
        return totalheight;
            }
   public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, 2,-1,-1,1,-1,-1, 3, -1, 6, 4, -1,-1,-1};
        BinaryTree.index = -1;  // Reset index before building the tree
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        System.out.println(" height of the tree :"+height(root));
           }
   }