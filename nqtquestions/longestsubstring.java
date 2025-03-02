
class longestsubstring
{
    public static void main(String args[])
    {
        String str= "akshay";
        int max=0;
        String substring="";
        
        for( int i=0; i< str.length()-1  ;i++)
        {
            int temp=1;
            String st="";
            char ch=str.charAt(i);
            st+=ch;
            for( int j=i+1 ; j< str.length() ;j++)
            {
               
                if(str.charAt(j) != ch)
                {
                    st += str.charAt(j);
                    temp++;
                }else{
                    break;
                }

            }

            max=Math.max(max,temp);
            if( st.length() > substring.length())
            {
                substring = st;
            }
            else{
                continue;
            }
                
        } 

        System.out.println(" "+max+ " "+substring);

    }
}