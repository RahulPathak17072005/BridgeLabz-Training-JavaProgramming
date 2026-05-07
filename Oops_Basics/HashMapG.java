package Oops_Basics;
import java.util.*;
public class HashMapG {

    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India",22);
        map.put("China",23);
        map.put("Russia",24);
        map.put("Australia",25);
        map.put("Canada",26);
        if(map.containsKey("Russia")){
            System.out.println("Present country");
        }else{
            System.out.println("Not at all: ");
        }
        
        


    }
}