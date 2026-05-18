package Generics_Basics;

import java.util.ArrayList;

public class WithGenerics {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(4);
      //  list.add("rahul"); // there is error to check(Type Safety)

// compile time checking


      //list.add(2.33);// non other data type no allowed;    ""  Compile time error  ""
      
     // String s=(String)list.get(0); // cannot cast integer to String because no need to type cast in this 

     list.add(5);
     System.out.println(list.get(1));


    }
}