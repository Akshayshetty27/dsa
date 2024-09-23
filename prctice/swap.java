import  java.util.Scanner;
class swap
{
     public static void main(String args[])
    {

         int num1,num2;
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter the numbers");
        num1=sc.nextInt();
        num2=sc.nextInt();
        System.out.println(" number1 :"+num1+" number2 : "+num2);

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println(" number1 :"+num1+" number2 : "+num2);
        
        
    }

}