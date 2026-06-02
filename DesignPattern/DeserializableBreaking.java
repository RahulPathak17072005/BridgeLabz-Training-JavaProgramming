package DesignPattern;

import java.io.Serializable;

public class DeserializableBreaking implements Serializable {

    private static final long serialVersionUID = 1L;

    private static DeserializableBreaking instance =
            new DeserializableBreaking();

    private DeserializableBreaking() {
    }

    public static DeserializableBreaking getInstance() {
        return instance;
    }
}


//Solution is readResolved

// public class Singleton {

//     private static volatile Singleton instance;

//     private Singleton() {

//         if(instance != null) {
//             throw new RuntimeException(
//                     "Use getInstance()");
//         }
//     }

//     public static Singleton getInstance() {

//         if(instance == null) {

//             synchronized (Singleton.class) {

//                 if(instance == null) {
//                     instance = new Singleton();
//                 }
//             }
//         }

//         return instance;
//     }

//     @Override
//     protected Object clone()
//             throws CloneNotSupportedException {

//         throw new CloneNotSupportedException();
//     }

//     protected Object readResolve() {
//         return instance;
//     }
// }