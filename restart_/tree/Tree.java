class Tree {   
    public static void main(String args[]) {
        Binarytree tree = new Binarytree();
        tree.insert(10);
        tree.insert(8);
        tree.insert(7);
        tree.insert(2);
        tree.insert(20);
        tree.insert(4);

        System.out.print("In-order Traversal: ");
        tree.inorder();
                System.out.print("\nPre-order Traversal: ");
        tree.preorder();
              System.out.print("\nPost-order Traversal: ");
        tree.postorder();

    }
}

class Binarytree {

    Node root;

    public void insert(int data) {
        root = insertrec(root, data);  
    }
    public Node insertrec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertrec(root.left, data);
        } else if (data > root.data) {
            root.right = insertrec(root.right, data);
        }

        return root;
    }

    public void inorder() {
        inorderrec(root);
    }
    public void inorderrec(Node root) {
        if (root != null) {
            inorderrec(root.left);
            System.out.print(root.data + " ");
            inorderrec(root.right);
        }
    }

    public void preorder()
    {
        preorderrec(root);
    }

    public void preorderrec(Node root)
    {
         if (root != null) {
            System.out.print(root.data + " ");
            inorderrec(root.left);
            inorderrec(root.right);
        }

    }


    public void postorder()
    {
        postorderrec(root);
    }
       public void postorderrec(Node root)
    {
         if (root != null) {
            inorderrec(root.left);
            inorderrec(root.right);
            System.out.print(root.data + " ");

        }

    }
}

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}
