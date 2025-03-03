import java.util.HashMap;
// import java.util.StringBuilder;
class pattern
{
    public static void main(String args[])
    {
        String str="a4b2c3s2";
        HashMap<Character , Integer> map = new HashMap<>();
        StringBuilder newstr= new  StringBuilder();
        for( int i=0 ; i< str.length();i=i+2)
        {
            char ch = str.charAt(i);
            int num = Character.getNumericValue(str.charAt(i+1));
         
            int count=0;
            while(count < num)
            {
                newstr.append(ch) ;
                count++;
            }
        }

System.out.println(" "+newstr);
    }
}