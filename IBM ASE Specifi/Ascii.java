class Ascii
{
    public static void main(String args[])
    {
        String str="73121326677122";
        int i=0;
        StringBuilder sb= new StringBuilder();
        while( i < str.length() - 2)
        {

            int num= Integer.parseInt(str.substring(i , i+ 3));
            if( num >96 && num <= 122)
            {
                char ch1= (char) num ;
                sb.append(ch1);
                i+=3;
            }
            else 
            {
                num= Integer.parseInt(str.substring(i , i+ 2));
                if( num == 32)
                {
                    sb.append(" ");
                    i+=1;
                }
                else
                if( num>64 && num <= 90)
               {
                char ch = (char)num;
                sb.append(ch);
                i+=2;
            }


            }
            
        

        }
        System.out.println(" "+sb.toString());
    }
}