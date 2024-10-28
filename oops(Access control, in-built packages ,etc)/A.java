class A
{
   private  int num;
protected   String name;
    int[] arr;
    public void setnum(int num)
    {
        this.num=num;
    }
    public int getnum()
    {
        return num;
    }
    public A(int num,String name)
{
    this.num=num;
    this.name =name;
    this.arr= new int[num];
}
    public static void main(String args[])
    {
  A obj = new A(34,"akshay");
  System.out.println(" "+obj.getnum());
  obj.setnum(4);
    System.out.println(" "+obj.getnum());
    System.out.println(" "+obj.name);

        //    class   package    subclass(            subclass(diff              world  (diff package 
                                // same package )           package )            and not subclass)
// public       yes     yes       yes                       yes                    yes 
// protected    yes     yes       yes                       yes                    yes 
// defaullt     yes     yes       yes   
// private      yes 


// private  for sensitive  can be accessd by getters and setters 
// default  is used  when we dont need access on other package 
// // prootected is mainly used in  inheritence 
// public every where can be accessed



// packages in java 
 // two typees 
  // user defined and  inbuilt packages 
  // iinbuilt -packages 
    //  1. lang package ->  essential like + ,-, operation and etc ( automatically imported )
    //  2. io package ->  file reading ,buffer reading  etc 
    //  3. util package ->  arratlist , linked list and other collection framework  and dsa related stuff 
    //  4. applet package ->  server 
    //  5. awt package ->  gui related stuff 
    /// 6. net -> for  nerwork related stuff 
    }
}