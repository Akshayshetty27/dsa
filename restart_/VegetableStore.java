import java.util.HashMap;
import java.util.Scanner;
class VegetableStore
{  
    static int total ;
    public static void main (String args[])
    {
        
        HashMap<String , Integer > map = new HashMap<>();
        map.put("Tomato",65);
        map.put("Carrot",110);
        map.put("Potato",70);
        map.put("Onion",80);
        map.put("Brinjal",110);
        Scanner sc= new  Scanner(System.in);


        boolean yes= true;
        String arr[] = {"Tomato","Carrot","Potato","Onion","Brinjal"};

        while(yes)
        {
            System.out.println(" what do you want to buy for \n  tomato click 1 \n Carrot click 2  \n  Potato click 3  \n onion click 4   \n Brinjal click  5 \n  ");
            int choice = sc.nextInt();

            System.out.println(" enter how many kgs ");

            int kg = sc.nextInt();

            total =  total +  (kg * map.get(arr[choice - 1])) ;

            System.out.println(" you want to buy any other ");
            yes= sc.nextBoolean(); 
        }


System.out.println(" your total price "+total);

    }
}