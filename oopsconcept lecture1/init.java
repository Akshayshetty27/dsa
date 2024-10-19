class init
{
    static int a=4;
    static int b;
    static {
        System.out.print(" i am in a static block ");
        b=a*5;
      }


    public static void main(String args[])
    {
        // this is a demo to show the initialization of a sttaic variables  
        init obj= new init();
        System.out.println(obj.b);
        obj.b +=3 ;
        // System.out.println()

    }
}