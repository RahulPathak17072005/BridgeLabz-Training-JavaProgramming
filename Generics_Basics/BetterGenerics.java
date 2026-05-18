package Generics_Basics;
/*
Symbol	Meaning
T	Type
E	Element
K	Key
V	Value
N	Number
Example:
 */
public class BetterGenerics<T> {
    T value;
    void setValue(T value){   // set value
        this.value=value;
    }
  T getValue(){     // get value
    return value;
 }


 public static void main(String[] args) {
    BetterGenerics<String> box=new BetterGenerics<>();
    box.setValue("Hello");
    System.out.println(box.getValue());           // String type

    BetterGenerics<Integer> box1=new BetterGenerics<>();
    box1.setValue(5);                                   //Integer type
    System.out.println(box1.getValue());
 }
    
}