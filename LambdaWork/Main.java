package LambdaWork;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Lambda...");

        //using third class object
        // MyInterImple myInter=new MyInterImple();
        // myInter.sayHello();


        //using anonymous class
        /*MyInterface i=new MyInterface() {
            @Override
            public void sayHello(){
                System.out.println("this is my first anonymous class");
            }
        };
        i.sayHello();
        MyInterface i2=new MyInterface() {
            @Override
            public void sayHello(){
                System.out.println("This is my second anonymous class");
            }
        };
        i2.sayHello();
        */


        //Using our Interface with the help of Lambda Expression
        
       /*  MyInterface i=()->System.out.println("This is my ist time i am using lambda");
        i.sayHello();

         MyInterface i2=()->System.out.println("This is my Second time i am using lambda");
        i2.sayHello();
        */


        // SumInter inter=( a,b)->a + b;
        // System.out.println(inter.sum(2,3));
        // System.out.println(inter.sum(7,7));



        LengthInter lengthInter=str->str.length();
        System.out.println(lengthInter.getLength("Hello Rahul"));

    }
}
 