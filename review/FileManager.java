package review;
import java.util.*;
import java.io.*;
public class FileManager <T>{
public void writeToFile(String fileName,ArrayList<T> data){
    try{
        BufferedWriter writer=new BufferedWriter(new FileWriter(fileName));
    for(T item : data){
        writer.write(item.toString());
        writer.newLine();
    }
    writer.close();
}
    catch(IOException e){
        e.printStackTrace();
    }
    finally{
        System.out.println("data added successfully");
       // writer.close();
    }
}
public ArrayList<String> readFromFile(String fileName){
    ArrayList<String> lines=new ArrayList<>();
    try{
        BufferedReader reader=new BufferedReader(new FileReader(fileName));
        String data;
        while((data=reader.readLine())!=null){
            lines.add(data);
        }
        reader.close();
    }
    catch(FileNotFoundException e){
        System.out.println("File not found Exception : ");
    }
    catch(IOException i){
        System.out.println("Error for reading lines : ");
    }
    return lines;
}
    
}