import java.util.Scanner;
 public class practice{   

    static float average(int num1,int num2 ,int num3)
    {
        float avg= (num1+num2+ num3) /3;
        return avg;
    }
    static int oddsum(int num1)
    {
       int odsum=0;
       int i;
        for(i=1;i<=num1;i++)
        {
            if(i%2==0)
            {
                continue;
            }
            else{
odsum=odsum+i;
            }

        }
        return odsum;
    }


    static int greatestnumber(int num1, int num2)
    {
        if(num1>num2)
        {
            return num1;
                    }
else{
    return num2;
}
    }

static float circumference(float num1)
{
    float cir;
    cir= 2* 3 * num1;
    return cir;
}

static boolean voteornot(int age)
{
    if(age>= 18){
        return true;

    }
    return false;
}
static void countoftype()
{
    int num;
     Scanner sc = new Scanner (System.in);
    int positive=0,negative=0,zero=0;
    while(true)
    {
        System.out.println(" the number of positive :"+positive+" and number of negative :"+negative+" and number of  zeroes :"+zero);
        num=sc.nextInt();
        if(num>0)
        {
positive=positive+1;
        }
        else if(num<0)
        {
            negative=negative+1;
        }
        else
        {
            zero=zero+1;
        }
    }


}

    public static void main (String args[])
{
    Scanner sc = new Scanner (System.in);

int num1,num2,num3;
System.out.println(" enter threee number \n");
num1=sc.nextInt();
num2=sc.nextInt();
num3=sc.nextInt();
System.out.println(" the average of the nmbers :"+average(num1,num2,num3));
System.out.println(" the odd sum of "+num1+" is :"+oddsum(num1));
System.out.println(" the greatest of the number "+num1+" and "+num2+" is :"+greatestnumber(num1,num2));
System.out.println(" the circmference of the radius"+ num1+" is "+circumference(num1));
if(voteornot( num1))
    System.out.println("  the person can  vote");
else
 System.out.println("  the person cannot vote");
 countoftype();
}
 }