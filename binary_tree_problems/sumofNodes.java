import java.util.*;

class sumofNodes{
    // Define the structure of the node
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

    // Define the BinaryTree class
    static class BinaryTree {
        static int index = -1;

        // Method to build the tree from the given nodes array
        public Node buildTree(int nodes[]) {
            index++;
            if (index >= nodes.length || nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    // Method to count the number of nodes in the tree
    public static int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);
        return leftNodes + rightNodes + 1;
    }

    // Method to calculate the sum of all nodes in the tree
    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum + rightSum + root.data;
    }

    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        // Reset index before building the tree
        BinaryTree.index = -1;
        Node root = tree.buildTree(nodes);
        System.out.println("The number of nodes = " + countOfNodes(root));
        System.out.println("The sum of the nodes = " + sumOfNodes(root));
    }
}
