class Odd{
    public static void main(String args[])
    {
        String str="akshay101jd11";
        String lon="";
        int num=0;
        char ch;
        int len=0;
        int maxlen=0;
        int odd=0;
        String max="";
        for( int i=0; i< str.length();i++)
        {
            ch=str.charAt(i);
            // System.out.println(ch);
            if(!Character.isDigit(ch))
            {
              maxlen=Math.max(maxlen,len);
              max+=lon;
              lon="";
              continue;
            }
            if( Character.isDigit(ch))
            {
                lon+=ch;
                len++;
            }
          
        }
        System.out.println("the number is "+maxlen+" odd number "+max);
    }
}