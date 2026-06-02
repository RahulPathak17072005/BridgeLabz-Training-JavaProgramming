package DesignPattern;

import java.io.*;

public class DeserialSol {

    public static void main(String[] args) throws Exception {

        DeserializableBreaking s1 =
                DeserializableBreaking.getInstance();

        // Serialization
        ObjectOutputStream oos =
                new ObjectOutputStream(
                        new FileOutputStream("abc.ser"));

        oos.writeObject(s1);
        oos.close();

        // Deserialization
        ObjectInputStream ois =
                new ObjectInputStream(
                        new FileInputStream("abc.ser"));

        DeserializableBreaking s2 =
                (DeserializableBreaking) ois.readObject();

        ois.close();

        System.out.println("S1 HashCode : "
                + s1.hashCode());

        System.out.println("S2 HashCode : "
                + s2.hashCode());

        System.out.println(s1 == s2);
    }
}