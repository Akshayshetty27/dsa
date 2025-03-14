class Reverse{
    public static void main(String args[])
    {
        String str= " hello world i am akshay";
        String strarr[]= str.split(" ");
        StringBuilder s= new StringBuilder();
        for( int i=strarr.length - 1; i>=0; i--)
        {
            s.append(strarr[i]+" ");
        }

        System.out.println(" "+s.toString());
    }
}