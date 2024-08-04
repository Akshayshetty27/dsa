  
class binary{
  static   class  Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
  }
   
    public static Node insert(Node root,int val)
    {
     if(root==null)
     {
      root = new Node(val);
      return  root;
     }
     if(root.data > val)
     {
        root.left=insert(root.left, val);

     }else{
       root.right= insert(root.right, val);
     }

    return  root;
    }

    
    public static void Inorder( Node root)
    {
        if(root== null)
         return;
        else
        {
            Inorder(root.left);
            System.out.println(" "+root.data);
            Inorder(root.right);
        }
    }
   
   public static boolean  search(Node root,int ele){
    if(root == null)
    {
        System.out.println("no element to search");
        return false;
    }
    else{
        if(root.data== ele)
        {
            return true;
        }
        else if(root.data < ele)
        {
            search(root.right, ele);
        }
        else{
        search(root.left, ele);
        }
        return  false;
    }


   }
    public static void main(String args[])
    {
    //  in a binary search tree the lest childs are less than root node and  the right childs are greater than the root node 
    //  the Inorder traversal of a binary search tree is always a  increasing sorted seqence !.
    //  the Binary Search Tree  makes search opration efficient 
    //  search compleexity is :  O(height)
    //  in a perfectly balanced  binary Search tree  the time complexity : O(logn n)
    System.out.println("Hello 1");
    int values[]={5,1,3,4,2,7};
    Node root=null;
 for(int i=0;i<values.length;i++){
     root=insert(root,values[i]);
    }
Inorder(root);
if(search(root, 9))
{
System.out.println(" element found");
}else
 System.out.println(" element not found");
    }
}