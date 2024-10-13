import java.util.HashMap;
import java.util.Map;
class Main
{
    
    public static void main(String args[])
    {
// declaring an object s1 of student class and initializing 
        Student s1= new Student( 5, "akshay" ,45);
        System.out.println(s1.name +" "+s1.roll +" "+s1.mark1);
        Student s2= new Student( 1, "abhilash" ,45);
        System.out.println(s2.name +" "+s2.roll +" "+s2.mark1);
           }

    static  class Student 
    {
      int roll;
      String name;
      int mark1,mark2;
      Student(int roll ,String name ,int  mark1)
      {
        this.roll= roll;
        this.name = name;
        this.mark1= mark1;
        // System.out.println(" roll number  "+roll+" , name "+ name + " and  marks :"+mark1+" ,"+mark2);
      }
    }
}