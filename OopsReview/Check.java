package OopsReview;

class Variable{
    static void display(){
    System.out.println("static method");
}
public void print(){
    System.out.println("Non static method: ");
}
}
class Student extends Variable{
static void display(){
    System.out.println("Overide static method ");
}
public void print(){
    System.out.println("Non-static Overrided ");
}
}
    public class Check {
        public static void main(String[] args) {
            Variable v=new Variable();
            Student s=new Student();
            v.display();
            v.print();
            s.display();
            s.print();
        }
        
    }