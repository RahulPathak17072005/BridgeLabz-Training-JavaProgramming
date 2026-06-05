package Stream_Basics;
@FunctionalInterface
public interface StreamFunctionalInterface {
    void show();   
}
class Student{
    public static void main(String[] args) {
        
        StreamFunctionalInterface obj=()->System.out.println("Hello");
        obj.show();
    }
} 
