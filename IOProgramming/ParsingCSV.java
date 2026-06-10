package IOProgramming;

import java.io.BufferedReader;
import java.io.FileReader;

public class ParsingCSV {
    public static void main(String[] args)throws Exception {
        String FilePath="IOProgramming/Student.csv";
        try(BufferedReader br=new  BufferedReader(new FileReader(FilePath))){
            br.readLine();
            String line;
            while((line=br.readLine())!=null){
                String[] data=line.split(",");
                int id=Integer.parseInt(data[0]);
                String name=data[1];
                int age=Integer.parseInt(data[2]);
                Student s=new Student(id,name,age);
                System.out.println(s);

            }
            System.out.println();


        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
class Student{
    int id;
    String name;
    int age;
    Student(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
    
}
