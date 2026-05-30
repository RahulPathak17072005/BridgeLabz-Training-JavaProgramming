package Annotation_Basics;
class Demo {

    @Deprecated
    void oldMethod() {
        System.out.println("Old Method");
    }

    void newMethod() {
        System.out.println("New Method");
    }
}

public class DeprecatedDemo {

    public static void main(String[] args) {

        Demo d = new Demo();

        // Calling deprecated method
        d.oldMethod();

        // Calling new method
        d.newMethod();
    }
}