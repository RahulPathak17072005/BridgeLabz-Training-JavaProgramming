package Annotation_Basics;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Student {

    String name();

    int age();

    String city() default "Mathura";
}

@Student(
    name = "Rahul",
    age = 21,
    city = "Mathura"
)
class Demo {

}

public class ReflectionDemo{

    public static void main(String[] args) {

        Class<Demo> c = Demo.class;

        Student s =
            c.getAnnotation(Student.class);

        System.out.println("Name : " + s.name());
        System.out.println("Age  : " + s.age());
        System.out.println("City : " + s.city());
    }
}