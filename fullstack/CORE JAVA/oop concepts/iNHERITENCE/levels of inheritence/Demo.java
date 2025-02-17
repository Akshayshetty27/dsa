class Demo
{
    public static void main(String args[])
    {
C obj = new C();

    }
}

class A {
    A(){
    System.out.println( " in Class A");

    }

}

class B {
    B(){
    System.out.println( " in Class B");

    }

}

class C  extends A 
{
    C(){
    System.out.println( " in Class c");

    }

}