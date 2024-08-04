import  java.util.*;
class level{
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
    public static  void  levelorder(Node root)
    { if(root==null)
    {
        return;
    }
        Queue<Node> qu= new LinkedList<>();
        qu.add(root);
        qu.add(null);
        while(!qu.isEmpty())
        {
            Node crr=qu.remove();
            if(crr==null)
            {
                System.out.println();
                if(qu.isEmpty())
                {
                    break;
                }
                else{
                    qu.add(null);
                }
            }else{
                System.err.println(" "+crr.data);
                if(crr.left!=null)
                {
                 qu.add(crr.left);
                }
                if(crr.right!= null)
                {
                    qu.add(crr.right);
                }
            }
        }
    }

    public static void main(String args[])
{

    int arr[]={1,2,4,-1,-15,-1,-1,3,-1,6,-1,-1};
    Binarytree tr=new Binarytree();
    Node root= tr.buildTree(arr);
    levelorder(root);
    System.out.println(" "+root.data);

    
}}