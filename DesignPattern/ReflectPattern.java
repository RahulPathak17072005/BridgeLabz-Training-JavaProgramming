package DesignPattern;

//Best Solution of this reflection code

// enum Singleton {

//     INSTANCE;
// }




public class ReflectPattern {
     private static ReflectPattern instance =
            new ReflectPattern();

    private ReflectPattern() {
 
// solution of reflection code

        //        if(instance != null) {
           // throw new RuntimeException(
            //    "Use getInstance()");
     //   }

    }

    public static ReflectPattern getInstance() {
        return instance;
    }
}
