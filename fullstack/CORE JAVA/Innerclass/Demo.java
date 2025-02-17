class Demo
{
    public static void main(String args[])
    {
        
        A o= new A(){
            public void show()
            {

                System.out.println(" in New Show ");
            }
        };
        o.show();
        // A.B obj = o.new B();
        A.B obj = new A.B();
        obj.config(); 
    }
}

class A {
      public void show()
      {
             System.out.println(" Showing ...");

      }
    //   class B{
    //      public void config ()
    //      {
    //          System.out.println(" Config ...");
    //      }
    //    }

       static class B{
         public void config ()
         {
             System.out.println(" Config ...");
         }
 
       }
}