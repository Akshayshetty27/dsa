// trie tree  it is a;so called as  retrieve tree  
// also called  prefix tree 
//   also called as pefix tree
//  tree in which a node can contain many number of child nodes
   // important 
      // the time complexity is ->  O(l) where l- length of the word 
     // root is an empty node 
     // prfix is not repeated 
// insertion in trie  ->  time complexity = O(l)



// time 45.47
class prefix{

   static  class Node{
        Node[] children;// maximum 26 node in each level if ristricted to albhabets[a-z A-Z]
        boolean eow;
        public Node()
        {
            children = new Node[26];// a to z
            for(int i=0;i<26;i++){  
             children[i]=null;
            }  
            eow = false;
        }
        
    }
    static  Node root= new Node();

    public static void insert(String word )
    {
        for(int i=0; i<word.length();i++)
        {
            int ind= word.charAt(i) -'a';
            
            if(root.children[ind]== null)
            {
                // add the node
                root.children[ind]= new Node();
            }
            if(i == word.length() -1 )
            {
                root.children[ind].eow= true ;
            }
            root=root.children[ind];
        }
    }
        public static void main(String args[])
    {
     String words[]={"the","a","there","any","their"};
       for (String word : words) {
           insert(word);
       }
    }
}

