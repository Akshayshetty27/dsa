import java.util.ArrayList;
import java.util.Collections;
class array {
    public static void main (String args[])
    {
        //  Array list : 
        //              1) size is variable .
        //              2) can store only objects .
        //              3) it doesnt store in the stack ,it is storeed on the heap .
        //  operations:
        //             1) Addition  2) get  3) modify  4) delete  5)iteration /operation 
    //     we have to use Integer | Float | boolean   Classes 
        ArrayList<Integer> list = new ArrayList<>();
list.add(4);
list.add(2);
list.add(8);


        //  adding elements to array list  using   :   .add(element) ;
        System.out.println(list);
        //  get elements operation

        //  add a element in between:    .add(index,element);
        list.add(0,5);
        System.out.println(list);

        //  remove an element :  .remove(index)
        list.remove(3);
          System.out.println(list);
    //     counting the nmber of elements in the array list 
     System.out.println(list.size());


    //   iteration 
    for(int i=0;i<list.size();i++)
    {
        System.out.println(list.get(i));
    }


    //   sorting method 
Collections.sort(list);


    }
}