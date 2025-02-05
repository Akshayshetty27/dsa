class Demo 
{
    public static void main(String args[])
    {

        Wagner obj = new Superwagnor();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}

abstract class Wagner extends Car
{
    public abstract  void fly ();

    public void drive()
    {
                System.out.println(" Driving ... ");

    }
}

 abstract class Car{
public abstract  void drive();
public abstract  void fly ();


         public void  playMusic()
     {
        System.out.println(" Playing music ... ");

     }

}

 class  Superwagnor extends Wagner{

public   void fly ()

{
System.out.println(" the car is in Flying Mode ...");
}




}
