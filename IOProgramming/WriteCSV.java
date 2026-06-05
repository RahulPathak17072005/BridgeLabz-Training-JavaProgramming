package IOProgramming;
import java.io.*;
public class WriteCSV {

    public static void main(String[] args)throws Exception {
        try{
            BufferedWriter bw=new BufferedWriter(new FileWriter("IOProgramming/Student.csv"));
            bw.write("id,name,age");
            bw.newLine();

            bw.write("5,Rahul,21");
            bw.newLine();

            bw.write("1,Shivam,22");
            bw.newLine();
            bw.write("3,Dinesh,25");
            bw.newLine();

            bw.write("8,Dev,23");
            bw.newLine();
            System.out.println("CSV data Created Successfully: ");
            bw.close();

            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}