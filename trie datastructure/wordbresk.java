class wordbeak
{
    static class Node{
        Node[] children;
        boolean eow;

        public Node()
        {
            children =new Node[26];
            for (int i = 0; i < 26; i++) {
             children[i]=null;   
            }
            eow=false;
        }
    }
    static Node root = new Node();
    public static void insert(String word)
    {
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {
            int ind=word.charAt(i) -'a';
            if(curr.children[ind] == null )
            {
                // add new node 
                curr.children[ind]=new Node();
            }
            if(i==word.length() -1)
            {
                curr.children[ind].eow=true;
            }
            curr=curr.children[ind];

    }
    }

    public static boolean  search( String key)
    {
        Node curr=root;
        for(int i=0;i<key.length();i++)
        {
            int ind=key.charAt(i) -'a';
            if(curr.children[ind] == null )
            {
            return false;
            }
            if(i==key.length() -1    && curr.children[ind].eow == false)
            {
               return false;
            }
            curr=curr.children[ind];
       
            }
            return true;
    }
    
    public  static boolean wordbreak(String key)
    {
        if(key.length() == 0)
        {
            return true;
        }

        for(int i=1;i<=key.length();i++)
        {
            String firstpart= key.substring(0,i);
            String secpart=key.substring(i);
            if(search(firstpart) && search(secpart))
            {
                return true;
            }
    }
    return false;
    }
    public static void main (String args[]){
String words[]={"i","like","sam","samsung","mobile"};
String key="samoilike";
for(String i : words) {
    insert(i);
}

System.out.println(wordbreak(key));

    }
}