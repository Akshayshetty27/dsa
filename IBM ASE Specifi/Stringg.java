class  Stringg
{
    public static void  main(String args[])
    {
        String str="akshay";
        StringBuilder sb = new StringBuilder();
        String encrypter= "12";
        int e= Integer.parseInt(encrypter);
         for( int i=0 ; i< str.length() ;i++)
        {
         int k=  (int) (str.charAt(i) )  ^ e;           
         sb.append(String.format("%2o", k));
        }
        System.out.println(sb.toString());        
    }
}