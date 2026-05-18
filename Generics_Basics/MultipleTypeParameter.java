package Generics_Basics;

public class MultipleTypeParameter<K,V> {
    K key;
    V value;
    MultipleTypeParameter(K key,V value){
        this.key=key;
        this.value=value;
    }
    void display(){
        System.out.println(key+ " "+ value);

    }
    public static void main(String[] args) {
        MultipleTypeParameter<Integer,String> box=new MultipleTypeParameter<>(5, "Rahul");
        box.display();
    }

    
}