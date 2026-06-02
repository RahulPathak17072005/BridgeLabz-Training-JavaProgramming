package DesignPattern;

public class Clone {
    CloningBreaking c1=CloningBreaking.getInstance();
    CloningBreaking c2;
    
    public Clone() throws CloneNotSupportedException {
        c1=CloningBreaking.getInstance();
        c2=(CloningBreaking) c1.clone();
    }
}
