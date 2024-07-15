class pen{
    String colour;
    String type;
    public void write()
    {
        System.out.println(" writing ");
    
       }
       public void printcol()
       {
        System.out.println(" color :"+this.colour+"\n type :"+this.type);
       }
    }


    class Student{
        String name;
        int age;
        public void printname()
        {
            System.out.println(" name :"+ this.name +" \n age  :"+this.age);
        }
Student(String name,int age)
{
    this.name=name;
    this.age=age;
    System.out.println(" constructor called");
    System.out.println(" name :"+this.name+" age:"+this.age);
}
    }
class obje{
    public static void main(String args[])
    {
        pen p1=new pen();
        p1.colour="blue";
        p1.type="ball pen";
        p1.printcol();
        p1.write();
        pen p2=new pen();
           p2.colour="red";
        p2.type="ball pen";
        p2.printcol();
        p2.write();

        Student s1=new Student("akshay",20);
       
        s1.printname();
    }
}