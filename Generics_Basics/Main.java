package Generics_Basics;

class GenericsMethods{
<T> void show( T data){
System.out.println(data);
} 
}
public class Main{
    public static void main(String[] args) {
        
        GenericsMethods box=new GenericsMethods();
        box.show("Hello");
        box.show(5);
        box.show(2.33);
    }

}