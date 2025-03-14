class Compress
{
    public static void main(String args[])
    {
        String str="aabcccccaaa";
// "aabcccccaaa" would become "a2b1c5a3"
int i=0;
StringBuilder sb= new StringBuilder();
       while ( i < str.length())
       {
        char ch = str.charAt(i);
        int count=1;
        int j=i + 1;
        while( j < str.length() && str.charAt(j) == ch)
        {
            count++;
            j++;
        }

        i=j;
        sb.append(ch);
        sb.append(count);
        
       }

       System.out.println(sb.toString());
    }
}