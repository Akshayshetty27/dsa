class Tree {
    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.insert(10);
        tree.insert(7);
        tree.insert(3);
        tree.insert(8);
        tree.insert(11);
        tree.insert(13);
        tree.insert(1);
        tree.insert(9);

        // Perform inorder traversal
        System.out.println("Inorder Traversal:");
        tree.inorder();
                System.out.println("\npre-order Traversal:");

        tree.preorder();
        System.out.println("\npost-order Traversal:");
        tree.postorder();
    }
}

class BinaryTree {
    Node root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    public Node insertRec(Node root, int data) { 
        if (root == null) {
            return new Node(data); 
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root; 
    }

    public void inorder() {
        inorderRec(root);
    }

    public void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print("->"+root.data);
            inorderRec(root.right);
        }
    }

    
    public void preorder() {
        preorderRec(root);
    }

    public void preorderRec(Node root) {
        if (root != null) {
            System.out.print("->"+root.data);
            inorderRec(root.left);
            
            inorderRec(root.right);
        }
    }
    public void postorder() {
        postorderRec(root);
    }

    public void postorderRec(Node root) {
        if (root != null) {
            
        postorderRec(root.left);
            
        postorderRec(root.right);
        System.out.print("->"+root.data);
        }
    }
}

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}
