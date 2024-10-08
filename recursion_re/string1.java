class string1
{
    public static  void removea(String str,int i,String newstr)
    {
        if(i  == str.length())
        {
            System.out.println(" "+newstr);
            return;
        }
        else{
            if(str.charAt(i)== 'a')
            {
                removea(str,i+1,newstr);
            }
            else{
                newstr+=str.charAt(i);
                removea(str,i+1,newstr);
            }
        }


    }

    public static String removestring(String str)
    {
        if(str.isEmpty())
        {
            return "";
        }
         
         if(str.startsWith("apple"))
         {
            return removestring(str.substring(5));
         }else{
            return str.charAt(0) + removestring(str.substring(1));
         }
               


    }
    public static void main(String args[])
    {

    removea("akshay",0,"");

    System.out.println(" "+removestring("bacappledh"));
    String str="shetty";
    System.out.print(" "+str.substring(3));
    }
}