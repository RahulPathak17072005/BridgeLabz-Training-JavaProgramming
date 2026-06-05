package IOProgramming;
import java.io.*;
public class ReadCSV {
public static void main(String[] args)throws Exception {
    try{

        BufferedReader br=new BufferedReader(new FileReader("IOProgramming/Student.csv"));
        String line;
        while((line=br.readLine())!=null){
            String[] data=line.split(",");
            for(String s:data){
                System.out.print(s);
            }
            System.out.println();
        }
        br.close();
    }
    catch(Exception e){
        e.printStackTrace();
    }
}
}