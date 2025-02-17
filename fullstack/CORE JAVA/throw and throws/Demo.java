
class AkshayException extends Exception{
    AkshayException(String str)
    {
        System.out.println(" "+str);
    }
}
class Demo
{
    public static void main(String args[])
    {
        int j=0;
        int result;
        try{
        result = 29 / j ;
        System.out.println(" "+j);
        if( j == 0)
         throw new ArithmeticException(" i dont want to print 0 ");
        }catch(ArithmeticException e)
        {
result= 18/1;
        System.out.println(e+" the default output : "+result);
        }finally{
                    System.out.println(" the finally block ");

        }



        try{
            String s=null;

            System.out.println(""+ s.length());
            throw new AkshayException(" this is defined by me ");            

        }catch(AkshayException e)
        {
            System.out.println(" "+e);
        }



System.out.println(" end");
    }
}
