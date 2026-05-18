package Generics_Basics;
import java.util.*;
public class WithoutGeneric {
    public static void main(String[] args) {
        
        ArrayList list=new ArrayList<>();
        list.add(5);//No type safety
        list.add("rahul");//No type safety
        String name=(String )list.get(1); //Type casting needed;
        String value=(String) list.get(1);//Type casting needed;
        System.out.println(name);
        System.out.println(value);
    }   
}