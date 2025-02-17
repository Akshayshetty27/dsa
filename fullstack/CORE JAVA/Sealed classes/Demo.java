class Demo
{
    public static void main(String args[])
    {

var obj = new B();
obj.run();
    }
}

sealed class A  permits B , C{
    public void run()
    {
        System.out.println(" running in A");
    }

}

non-sealed class B extends A
{

 public void run()
    {

        System.out.println(" running in B");
    }
}

non-sealed class C  extends A{
 public void run()
    {
        System.out.println(" running in C");
    }
}

class D{

}