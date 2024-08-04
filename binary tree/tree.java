





class tree{
    static class Node
    {
        Node left;
        int data;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static  class Binarytree
    {
        static int index;
        public   Node buildTree(int arr[])
        {
        index++;
        if(arr[index]==-1)
        {
            return  null;
        }
    Node newnode=new Node(arr[index]);
    newnode.left=buildTree(arr);
    newnode.right=buildTree(arr);
    return newnode;
        }

    }
    public static  void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root)
    {
        if(root == null)
        {
         return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(" "+root.data);
    }

    public static void Inorder(Node root)
    {
     if(root == null)
     {
        return;
     }
     Inorder( root.left);
     System.out.print(" "+root.data);
     Inorder(root.right);
    }
    public static void main(String args[])
{

    int arr[]={1,2,4,-1,-1,-1,-1,3,-1,6,-1,-1};
    Binarytree tr=new Binarytree();
    Node root= tr.buildTree(arr);
    System.out.println("pre-order traversal");
    preorder(root);
    System.out.println("in-order traversal");
    Inorder(root);
    System.out.println("post-order traversal");
    postorder(root);
    System.out.println(" "+root.data);

}}