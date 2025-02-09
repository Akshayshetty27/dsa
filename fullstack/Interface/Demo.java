class Demo
{
    public static void main(String args[])
    {

        Computer lap = new Laptop();
         lap.code();
         
        Computer desk = new Desktop();

       
        desk.code();

    }
}

interface Computer
{
    public abstract void code();
}

class Laptop implements Computer{
    public void code()
    {
        System.out.println(" code compile run...");
    }
}

class Desktop implements Computer{
     public void code()
    {
        System.out.println(" code faster ..compile run...");
    }
}