
abstract class animal
{
   abstract void walk();
}

class Horse extends animal
{
    Horse()
    {
        System.out.println(" horse created");
    }
    public void walk()
    {
        System.out.println(" walks on four leg");
    }
}

class Chicken extends animal
{
    Chicken()
    {
        System.out.println( " created a horse");
            }
    public void walk()
    {
        System.out.println(" walks on two leg");
            }
}

class pa
{
    public static void main(String args[])
    {
Horse h1=new Horse();
h1.walk();
Chicken c1=new Chicken();
c1.walk();
    }
}