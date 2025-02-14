class Demo{
    public static void main(String args[])
    {
   A obj= new A();
   Runnable obj1= () -> {

        for(int i=0; i< 10; i++)
        {
            System.out.println(" hello");
        try{
            Thread.sleep(10);

        }catch(InterruptedException e)
        {
            System.out.println( " "+e);
        }
    }
   };

   Runnable  obj2 = () ->
   {
    for( int i=1; i< 10 ; i++)
    {
        System.out.println(" "+i);
 try{
            Thread.sleep(10);

        }catch(InterruptedException e)
        {
            System.out.println( " "+e);
        }    }

   };

   Thread  t3= new Thread( obj2);
Thread t1= new Thread(obj);
Thread t2= new Thread(obj1);
t1.start();
t2.start();
t3.start();

    }
}

class A implements Runnable
{
    public void run()
    {
        
        for(int i=0; i< 10; i++)
        {
            System.out.println(" hi ");
        try{
            Thread.sleep(10);

        }catch(InterruptedException e)
        {
            System.out.println( " "+e);
        }
        }
    }
}

// class B implements Runnable
// {
//     public void run()
//     {
//         for(int i=0; i< 10; i++)
//         {
//             System.out.println(" hello");
//         try{
//             Thread.sleep(10);

//         }catch(InterruptedException e)
//         {
//             System.out.println( " "+e);
//         }
//         }
//     }
// }