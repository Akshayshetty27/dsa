import java.util.Scanner;
// import String;
class concatenation{
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
        String fname,mname,lname ;
        System.out.println(" enter your first name ");
        fname=sc.next();
         System.out.println(" enter your middle name ");
        mname=sc.next();
         System.out.println(" enter your last name ");
         lname=sc.next();
         String name="";

 //  concat()
         name=fname+" "+mname+ " "+lname ;
          System.out.println(" name :"+name);
name="";
        name=name.concat(fname +" "+ mname+" " + lname);
           System.out.println(" name :"+name); 
// length()
           int len=name.length() ;
           System.out.println(" the number of  charcters :"+len);
//   charAt()
int i;
           for(i=0;i<name.length();i++)
           {
            System.out.println(" "+name.charAt(i));

           }
           System.out.println("");


// compareTo()
if(fname.compareTo(lname)==0)
{
    System.out.println(" your first name and last name cannot be same");
}

else{
     System.out.println("VALID NAME");
}


//  substring(first index, last index)
String sub=name.substring(0,11);
System.out.println(" "+sub);
    }
}