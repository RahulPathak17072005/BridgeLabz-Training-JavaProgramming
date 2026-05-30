package Annotation_Basics;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Authors {
    Author[] value();
}

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Authors.class)
@interface Author {
    String value();
}

@Author("Rahul")
@Author("Amit")
@Author("Rohan")
class Project {
}

public class RepeatableDemo {

    public static void main(String[] args) {

        Author[] authors =
            Project.class.getAnnotationsByType(Author.class);

        for (Author a : authors) {
            System.out.println(a.value());
        }
    }
}