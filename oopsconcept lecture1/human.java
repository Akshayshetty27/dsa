// understanding static  keyword in java with example 

class human
{
    int age ;
    String name;
    boolean married;
    static int population=0;
  human(int age ,String name , boolean married )
    {
     this.age=age;
     this.name=name;
     this.married=married;
     this.population+= 1;
    }
    // we know that  something which is not static , belongs to an object 

    //we can call a static method inside a non sttaic 
    // but inside a sttaic method we cannot call a no static method 
    void greeting()
    {
        System.out.print(" hello ");
    }
    void fun()
    {
          greeting();
        System.out.print(" having  fun ");
      
    }
    public static void main(String args[])
    {
     human h1= new human(18 , "abc", false);
      h1.fun() ;
     System.out.println(" name : "+h1.name+" age : "+ h1.age + " marriage status : "+ h1.married+" the total population : "+h1.population+" billion");
     human h2= new human(23, "bac", true);
    h2.fun();
     System.out.println(" name : "+h2.name+" age : "+ h2.age + " marriage status : "+ h2.married+" the total population : "+h2.population+" billion");
     human h3= new human(45,"vittal ",true);
     h3.fun();
     System.out.println(" name : "+h3.name+" age : "+ h3.age + " marriage status : "+ h3.married+" the total population : "+h3.population+" billion");
   

    // greeting();  cannot be called  inside a static main class 

    }
}