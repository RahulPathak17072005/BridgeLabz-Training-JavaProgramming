package Streams;
import java.io.*;
public class ByteStreamChaining {
public static void main(String[] args) {
    int data;
    try(ObjectOutputStream oos=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("data.txt"))) ){
        System.out.println("Serialized Successfully: ");
    }catch(IOException e){
        e.printStackTrace();
    }
}
    
}