package DesignPattern;

public class SingletonPattern {

    private static SingletonPattern instance;
    private SingletonPattern(){

    }
    static SingletonPattern getInstance(){
        if(instance==null){
            instance=new SingletonPattern();
        }
        return instance;
    }
}