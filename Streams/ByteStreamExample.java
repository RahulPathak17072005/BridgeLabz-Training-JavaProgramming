package Streams;
import java.io.FileInputStream;
import java.io.IOException;
public class ByteStreamExample {
    public static void main(String[] args) {
        
        try(FileInputStream  fis=new FileInputStream("Example.txt")){
            int data;
            while ((data=fis.read())!=-1) {
                System.out.println((char) data);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}