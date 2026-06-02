package DesignPattern;

import java.lang.reflect.Constructor;



public class Reflect {
    public static void main(String[] args)throws Exception {
        SingletonPattern singleton=SingletonPattern.getInstance();
        Constructor<SingletonPattern> c=SingletonPattern.class.getDeclaredConstructor(null);
        c.setAccessible(true);
        SingletonPattern singleton2=c.newInstance();  // We have to remember these point;
        System.out.println(singleton.hashCode());
        System.out.println(singleton2.hashCode());
        System.out.println(singleton==singleton2);
    }
}
