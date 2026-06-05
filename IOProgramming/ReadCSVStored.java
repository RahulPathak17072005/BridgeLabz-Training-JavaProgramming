package IOProgramming;
import java.io.*;

public class ReadCSVStored {
    public static void main(String[] args)throws Exception {
        try{
            BufferedReader br=new BufferedReader(new FileReader("IOProgramming/Student.csv"));
            br.readLine();
            String line;
            while((line=br.readLine())!=null){
                String[] data=line.split(",");
                int id=Integer.parseInt(data[0]);
                String name=data[1];
                int age=Integer.parseInt(data[2]);

                System.out.println("id :"+id+"Name : "+name+ "age : "+age);
            }
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
