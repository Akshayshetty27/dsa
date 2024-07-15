// //  hiearchical datastructure
// //  tree  - types 
// //  binary type - the tree which can have only two child 
// //  level & sub tree  ina tree :
// //  
// public class Tree
// {
//     static class Node{
//         int data;
//         Node left;
//         Node right;
//         Node(int data)
//         {
//             this.data=data;
//             this.left=null;
//             this.right=null;

//         }
//     }

//     static class BinaryTree
//     {
//        static int index = -1;

// public static Node BuildTree(int nodes[]) {
//     index++;
//     if (nodes[index] == -1) {
//         return null;
//     }

//     Node newNode = new Node(nodes[index]);
//     newNode.left = BuildTree(nodes);
//     newNode.right = BuildTree(nodes);

//     index--; // Restore index before returning
//     return newNode;
// }
// public static void preorder(Node root)

// {
//     if(root==null)
//     {
//         System.out.print("-1");
//         return;
//     }
//     System.out.print(root.data+" ");
//     preorder(root.left);
//     preorder(root.right);
// }
// }  
// }
//     public static void main(String args[])
//     {
// int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
// BinaryTree tree =new BinaryTree();
// Node root=tree.BuildTree(nodes);
// System.out.println(root.data);
//     }

// }


public class Tree {
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

        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void postorder(Node root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree.index = -1;  // Reset index before building the tree
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        System.out.println("Preorder traversal:");
        tree.preorder(root);
        System.out.println("\nInorder traversal:");
        tree.inorder(root);
        System.out.println("\nPostorder traversal:");
        tree.postorder(root);
    }
}
