package MultiThreadingWork;
import java.lang.Runnable;
public class CreateUsingLambda {
    public static void main(String[] args) {
        
    Runnable thread1=()->{
        for(int i=0;i<10;i++){
            System.out.println("The value is :"+i);
        }try{
            Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();

        }
        
    };
    Thread t=new Thread(thread1);
    t.start();
}
}
