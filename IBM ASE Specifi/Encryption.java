class Encryption{
    public static void main(String args[])
    {
        String str="text";
        String key= "1234";
        int ko= Integer.parseInt(key.substring(0,2));
        int ke= Integer.parseInt(key.substring(2,4));

        StringBuilder sb = new StringBuilder();

        for( int i=0 ; i<  str.length() ; i++)
        {
            int ch =(int) str.charAt(i);
            if( i% 2 == 0 )
            {
               int  s= ch ^ ko;
               sb.append(String.format( "%02x",s ));
            }else{
                int ss= ch ^ ke;
               sb.append(String.format( "%02x",ss));

            }
        }

System.out.println(" "+ sb.toString());

    }
}