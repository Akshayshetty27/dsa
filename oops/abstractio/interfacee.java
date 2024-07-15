interface animal
{
  public  void walk();

}
interface herbivore{
    public void eat();
}
class Horse implements animal,herbivore
{
    Horse()
    {
        System.out.println(" horse created");
    }
    public void walk()
    {
        System.out.println(" walks on four leg");
    }
     public void eat(){
        System.out.println(" eats vegetables");
            }
}

class interfacee
{
    public static void main(String args[])
{
Horse h1=new Horse();
h1.walk();
h1.eat();
}
}