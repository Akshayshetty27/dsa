import java.util.Scanner;
class operator
{
public static void main(String args[])
{
    // binary operator - perform operation between two numbers.
        //  Arithmetic operatord   -->   '+' ,'-' ,'*' ,'/' ,'%'
        //  unary --->   '++' , '--' 
           // pre-increment-->  '++a' or '--a'
           // post-increment-->  'a++' or 'a--'
int a,b;
Scanner sc= new Scanner(System.in);
System.out.println(" enter the value of a and b");
a=sc.nextInt();
b=sc.nextInt();
System.out.println(" performingthe preincrement");
b=(++a);
System.out.println(" b :"+b);
a=(b++)-(--a);
System.out.println(" a :"+a);
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");


System.out.println(" relational operators :");
if(a==b)
{
    System.out.println(" a is equal to b");
}
else  if (a>=b){
    System.out.println(" a is greater than or equal to b");

}else  if (a<=b){
    System.out.println(" a is less  than or equal to b");

}else if(a!=b) {
    System.out.println(" a is not equal to b");

}

System.out.println(" ");
System.out.println(" ");
System.out.println(" ");

System.out.println(" logical operators");
if(!(a>b && a!= b))
{
    System.out.println(" a is less than b and a is not eqal to b ");
}
if(a>b || a!= b)
{
    System.out.println(" a is greater than b or a is not eqal to b ");
}
if( a!= b)
{
    System.out.println("  a is not eqal to b ");
}
}
}