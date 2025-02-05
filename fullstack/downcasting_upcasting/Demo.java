

class Demo
{
    public static void main(String args[])
    {
        // typecasting 
        double d= 4.5;
        int i= (int)d;
        System.out.println(i);

        A obj= new B();
        obj.show();
        // obj.show1();
        B obj1 = (B) obj ;
        obj1.show1();

    }
}

class A{

public void show()
{
System.out.println(" in A show ");
}
}
class B extends A{
public void show1()
{
    System.out.println(" in B show ");
}
}