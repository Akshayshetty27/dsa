class this_super
{
    public static void main(String args[])
    {
//  by default every class created in the  java file extends the object class which is defined by the java 
B obj = new B(5);
obj.show();

    }
}

class A{
    public A()
    {
        System.out.println(" in class A ");
    }
    public A(int n)
{

    System.out.println(" this constructor of A :"+ n);
}

public void show()
{
    System.out.println(" the is show method ");

}

}

class B extends A{
public B()
{
    super(5);

    System.out.println(" in class b");
}
public B(int n)
{
    this();  
    System.out.println(" this constructor of b"+ n);
}


}