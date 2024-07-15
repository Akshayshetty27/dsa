//  solve  this pattern 
//  1)1
//    1 2
//    1 2 3 
//    1 2 3 4   ...
// 2)  * * * * * *
//     *         * 
//     *         *
//     *         *
//     * * * * * *
// 3) A B C D 
//    A B C 
//    A B 
//    A 

import java.util.Scanner;
public class pattern{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m,i,j;
        System.out.println("Enter the number");
        m=sc.nextInt();
        for(i=0;i<m;i++)
        {
            for(j=0;j<i+1;j++)
            {
                System.out.print(" "+(j+1));
            }
System.out.println("");

        }

System.out.println(" \n second pattern \n");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                if(i==0 || i==(m-1) || j==(m-1) || j==0)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
               
            }
             System.out.println("");
        }

        System.out.println(" \n third pattern \n");
 for(i=m;i>0;i--)
        {
     for(j=0;j<i;j++)
            {
                System.out.format("%c ",('A'+j));
            }
System.out.println("");

    }
    }
}
