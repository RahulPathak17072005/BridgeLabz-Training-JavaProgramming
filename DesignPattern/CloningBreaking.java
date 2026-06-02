package DesignPattern;
import java.lang.Cloneable;
class CloningBreaking implements Cloneable {

    private static CloningBreaking instance =
            new CloningBreaking();

    private CloningBreaking() {}

    public static CloningBreaking getInstance() {
        return instance;
    }

    @Override
    protected Object clone()
            throws CloneNotSupportedException {

        return super.clone();
    }
}
