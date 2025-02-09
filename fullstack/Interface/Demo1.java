class Demo1
{
    public static void main(String args[])
    {

B obj= new B();
obj.show("Mangaluru");
obj.config();

    }
}

interface A{
    int age= 44;
    String name=" akshay ";

    void show(String area);
    void config();

}
interface X extends A
{
    void run();
}


class B implements A, X
{
    public void show(String area)
    {
        String are= area;
        System.out.println(" this is A ANd B show implemented in interface b "+name+" from "+are);
            }
    public void config()
    {
        System.out.println(" this is A and B config implemented in interface b "+age);
    }
    public void run()
    {
        System.out.println(" running ....");
    }
}

