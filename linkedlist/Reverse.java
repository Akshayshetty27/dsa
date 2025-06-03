class Reverse
{
    public static void main(String args[])
    {
        String str = "akshay";
        String revrsed = new StringBuilder(str).reverse().toString();
        System.out.println(" reverse using inbuilt :  "+ revrsed+"\n");

        String con= "";

        for( int i= str.length()-1 ; i >= 0 ; i--)
        {
            con += str.charAt(i);
        }

        System.out.println(" using loop : "+con+" \n");

        String substr ="";
          for (int i = str.length() - 1; i >= 0; i--) {
            substr += str.substring(i, i + 1);
        }


       System.out.println(" using  substring method  : "+substr+" \n");


    }
}