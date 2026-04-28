
package OopsReview;
class Person{
    private int id;
    private String name;
    private int age;
    protected static int totalRegistrations=0;
    //int[] arr;
    Person(int i,String n, int a){
        this.id=i;
        this.name=n;
        this.age=a;
        totalRegistrations++;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    } 
    public int getAge(){
        return age;
    }

    protected String getRole(){
        return "Person";

    }

}
class Patient extends Person {
    String disease;
    String ward;
    public Patient(int id,String name,int age,String d,String w){
        super(id,name,age);
        this.disease=d;
        this.ward=w;
    }
    public String getRole(){
        return "Patient";
    }
     public String toString(){
        return "Patient"+" Id :"+getId()+" name: "+ getName()+" age : "+getAge()+" Disease "+disease + " ward "+ ward;
    }

}
class Doctor extends Person{
String specialization;
int experience;
public Doctor(int id,int age,String name,String spec,int exp){
    super(id,name,age);
    this.specialization=spec;
    this.experience=exp;
}
protected String getRole(){
    return "Doctor";
}
 public String toString(){
        return "Doctor"+" Id :"+getId()+" name: "+ getName()+" age : "+getAge()+" Specialization "+specialization + " experience "+ experience;
    }
}

public class HospitalManagementBasic {
public static void main(String[] args) {
    Person[] people={
        new Patient(1, "Kunal", 22, "Stone","Yamuna"),
        new Patient(2, "Aman", 21, "Neuro","Neurology"),
        new Doctor(3,25,"Dr. Alok Gupta","Kidney Specialist",15),
        new Doctor(4,35,"Dr. RC Mishra","Neurologist",18)
    };
    for(Person p:people){
        System.out.println(p.toString());
        if(p instanceof Patient){
            System.out.println("Role"+((Patient)p).getRole());
        }else{
            System.out.println("Role"+((Doctor)p).getRole());
        }
    }
    System.out.println("Total Registration till now: "+Person.totalRegistrations);
}
    
} 