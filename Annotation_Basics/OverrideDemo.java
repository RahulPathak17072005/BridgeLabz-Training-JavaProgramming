package Annotation_Basics;
// NOT REQUIRED
//import java.lang.Override;
class Parent {

    void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {

    @Override
    void show() {
        System.out.println("Child");
    }
}

public class OverrideDemo {
    public static void main(String[] args) {

        Parent p = new Parent();
        p.show();

        Child c = new Child();
        c.show();

        Parent obj = new Child();
        obj.show();
    }
}