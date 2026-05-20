package Streams;
import java.io.FileOutputStream;
import java.io.IOException;
public class ByteSteamExample1 {
public static void main(String[] args) {
    String data="Hellow World";
    try(FileOutputStream fos=new FileOutputStream("Example.txt")){
        fos.write(data.getBytes());
    }catch(IOException e){
        e.printStackTrace();
    }
}
    
}