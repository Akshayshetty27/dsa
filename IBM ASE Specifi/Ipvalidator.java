class Ipvalidator
{
    public static boolean ipvalid(String a[])
    {
        for( String s : a)
        {
            if( s.length() != 3)
             return false;

             int ss= Integer.parseInt(s);
             if(ss > 256   || ss < 0)
              return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        String ip= "122.233.252.008";

        String a[] = ip.split("[.]");

        for( String s : a)
         System.out.println(" "+s);

        if( ipvalid(a))
        {
            System.out.println("valid ip address");
        }else
        {
            System.out.println("not a valid ip address");
        }
    }
}