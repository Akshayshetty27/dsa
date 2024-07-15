
    class Student{
        String name;
        int age;
        public  void printinfo( String name)
        {
         System.out.println(name);
        }
        public  void printinfo( int age)
        { 
            System.out.println(age);
        }
        public  void printinfo( String name,int age)
        {
            
            System.out.println(name+" "+age);
        }
    }
    
    class polymorphism{
    public static void main (String args[])
    {
        Student s1= new Student();
        s1.name="akshay";
        s1.age=20;
        s1.printinfo(s1.age);
        s1.printinfo(s1.name);
        s1.printinfo(s1.name,s1.age);

    }
}

    

// two types of polymorphism
//  1.compile time 
//  2. run time 
