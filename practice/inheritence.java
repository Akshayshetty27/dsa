class inheritence
{
    public static class Animal
    {
       public void eat(String name,String food)
       {
    
        System.out.println(name+" eats "+food);
       }
    }

    public static  class Tiger extends Animal{
      public void tigereats(String food)
      {
        System.out.println(" tiger eats "+food);
      }
    }
    public  static void main(String args[])
    {
   Animal a= new Animal();
//   a.eat();
  Tiger t= new Tiger();
  t.tigereats("donkey");
  t.eat("tiger" , "food");

    }}