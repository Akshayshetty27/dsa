class oop1
{
    public static void main(String args[])
    {
        human h1= new human(21 , "Akshay ", 'M');
        h1.show();
        int age= h1.getage();
        System.out.println(" the age from main class using method : "+age);
        String name= h1.getName();
         System.out.println(" the name from main class using method : "+name);

         human h2= new human();
    }
}
class human
{
   private  int age;
   private String name;
   private char gender;
// constructor 
   human()
   {
    System.out.println(" a default constructor ");
   }
    human(  int age,String name,char gender)
    {
        this.age=age;
        this.name=name;
        this.gender=gender;

    }
    // get method  by default even java provides this 
    public String getName()
    {
        return name;
    }
    public int getage()
    {
        return age;
    }
    // method which print the value of particular object using this keyword 
    public void  show()
    {
        System.out.println("Name :"+this.name+" age :"+this.age+" gender : "+this.gender);
    }
}