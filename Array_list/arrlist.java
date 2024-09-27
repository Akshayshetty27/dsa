
import java.util.ArrayList;

class arrlist
{
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("abhi");
        list.add("adhithi");
        list.add("akhilesh");
        list.add("ananya");

     

       list.remove(2);
       list.addLast("bsdk");
          for (String i : list)         
              System.out.print(i+" ");
    

    }
}