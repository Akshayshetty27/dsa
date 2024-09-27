
import java.util.Scanner;

class logic 
{
    public static void main(String[] args) {
     boolean ch=true;
     Scanner sc = new Scanner(System.in);
     int pos=0,neg=0,zero=0;
     int num;
     while(ch)
     {
      System.out.println("enter the number ");
    num=sc.nextInt();
    if(num == 0)
     zero+=1;
    else if(num>0)
     pos+=1;
    else
     neg+=1;

   System.out.println("want to continue   enter true else false ");
      ch=sc.nextBoolean();
     }

System.out.println("the number of positive:"+pos+" the number of negative "+neg+" the number of zeores entered "+zero);
    }
}