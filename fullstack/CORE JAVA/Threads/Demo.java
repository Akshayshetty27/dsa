class Demo
{
    public static void main(String args[])
    {
            A obj = new A();
                B obj1= new B();
            obj.start();
            try{
        Thread.sleep(10);
        }catch( InterruptedException e)
        {
            e.printStackTrace();
        }
        
            obj1.start();
    }
}

class A extends Thread{
    public void run()
    {
        
        for( int i=0; i< 10; i++)
        {
            System.out.println(" Hi"+"  ");
            try{
        Thread.sleep(100);
        }catch( InterruptedException e)
        {
            e.printStackTrace();
        }
            
        }   
        
    }
}

class B extends Thread{
    public void run()
    {
        for( int i=0; i< 10; i++)
        {
            System.out.println(" Hello "+"  ");
              try{
        Thread.sleep(100);
        }catch( InterruptedException e)
        {
            e.printStackTrace();
        }

        }   
    }
}