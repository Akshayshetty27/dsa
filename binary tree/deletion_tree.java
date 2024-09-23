class deletion_tree
{
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
        public static Node delete(Node root, int val)
        {
         if(root.data > val)
         {
          root.left= delete(root.left, val) ;

         }
         else if( root.data<val)
         {
            root.right=delete(root.right, val);
         }
         else
         {
            //  case 1:
            if(root.left==null && root.right==null)
             return null;
            
            //  case 2
            if(root.left== null)
             return root.right;
            
        //   case 3  
           Node Is= inorder_successor(root.right);
           root.data=Is.data;
           root.right= delete(root.right, Is.data);
         }
         return null;
        }
        public static  Node inorder_successor( Node root)
        {
   while(root.left != null)
   {
    root=root.left;
   }
   return root;
        }
    public static void main(String args[])
    {
          int arr[]={1,2,4,-1,-1,-1,-1,3,-1,6,-1,-1};
          Binarytree tr=new Binarytree();
          Node root= tr.buildTree(arr);
           System.out.println(" "+delete(root, 4)); 
        //   tr.buildTree(arr);


    }
}