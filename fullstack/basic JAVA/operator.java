import java.util.Scanner;

class operator {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int num1= 3;
        int num2= 5;
        int result = num1+ num2;
        System.out.println(" "+result);

        result= num1%num2;
        System.out.println(" "+result);
        result= num2/num1;
         System.out.println(" "+result);

        result = num2* num1;
        System.out.println(" "+result);
        System.out.println("num1 : "+(++num1));

        result = result + num1;
        System.out.println(" "+result);
        System.out.println(" "+(--result));

      result= 4 | 2;
     System.out.println(" "+result);

     boolean b= (4==3) ;
     System.out.println(" "+(!b));


     if( b)
     {
        System.out.println(" b : is  "+b);
     }else{
        System.out.println(" b : is  "+b);
     }




     int n= 4;
     if( n% 2== 0)
     {
            n= n+11;
              System.out.println("even "+n);
          
              }
     else
              System.out.println(" odd "+n);

System.out.println("value :"+n);
     

     result=   n% 2 == 0 ? 4 : 5 ;
     System.out.println("result "+ result);


System.out.println("enter the value of  gg");
int  gg= sc.nextInt();


switch( gg){
    case 1:System.out.println(" sunday ");
        
    break;
    case 2: System.out.println(" monday "); 
    break;
    case 3:System.out.println(" tuesday ");
    break;
    case 4:  System.out.println(" wednesday ");
    break;
    case 5 : System.out.println(" thursday "); 
    break ;
    case 6: System.out.println(" friday "); 
    break;
    case 7: System.out.println(" saturdyday ");
    break;
    default : 
    System.out.println(" not valid day  ");
}


for( int i=1; i<10 ; i++)
{
    System.out.print( (i)+" ");
}
System.out.println(" \n while loop ");
int i=10;
while (i > 0)
{
    System.out.print( (i)+" ");
    i--;

}

System.out.println(" \n Do while loop ");

int j=20;
do{
    System.out.print( j+" ");
    j--;

}while(j> 9);

System.out.println("\n  random  number genrator  ");

int  rand= (int) ( Math.random() * 100 );
System.out.println(rand);

int arr[]= { 3,4,5,6,7,8,};
for( int k : arr)
{
    System.out.println(" "+ k);
}
    }

}