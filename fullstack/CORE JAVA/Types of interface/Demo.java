class Demo
{
    public static void main(String args[])
    {
        // three types
        //  1. Single interface   2. Functional interface   3. Markser inerface 


        // Functional interface
        A obj= (i) ->{
System.out.println(" in A interface "+ i);
        };
        // {
        //     public void show()
        //     {
        //              System.out.println(" in A interface");
        //      }
   
        //     };
        
        obj.show(5);

    }
}

@FunctionalInterface
interface A{
    public void show(int i);
    
}
class B implements A{
    public void show(int i)
    {
        System.out.println(" in A interface and class B"+i);
    }
}