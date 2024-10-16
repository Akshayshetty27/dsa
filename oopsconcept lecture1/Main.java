import java.util.HashMap;
import java.util.Map;
class Main
{
    
    public static void main(String args[])
    {
// declaring an object s1 of student class and initializing 
        Student s1= new Student( 4, "akshay  " ,45);
        System.out.println(s1.name +" "+s1.roll +" "+s1.age);
        Student s2= new Student( 1, "abhilash" ,45);
        System.out.println(s2.name +" "+s2.roll +" "+s2.age);
        // java can have multiple constructor  i.e it can be override 
      // default constructor ( without any parameters )
        Student s3 = new Student();
        System.out.println(" "+s3.roll +" "+s3.name +" "+ s3.age);
        // this keyword acts as a  refference of an object creted of a class 
           }

    static  class Student 
    {
      int roll;
      String name;
      int age;
      // parameterized constructors 
      Student(int roll ,String name ,int  mark1)
      {
        this.roll= roll;
        this.name = name;
        this.age= mark1;
        // System.out.println(" roll number  "+roll+" , name "+ name + " and  marks :"+mark1+" ,"+mark2);
      }
      Student()
      {
        // System.out.println(" hello");
        this.roll= 13;
        this.name="akhsay";
        this.age=21;
        
      }
    }
}