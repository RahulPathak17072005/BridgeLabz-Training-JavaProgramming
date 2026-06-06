package LambdaWork;

public class ThreadDemo {
 public static void main(String[] args) {
    //first thread : Thread -Rahul

    Runnable thread1=()->{
        //this is the body of the thread stuff

        for(int i=1;i<=10;i++){
            System.out.println("Value of i: -"+i);
            try{

                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    };
    Thread t=new Thread(thread1);
    t.setName("Rahul");
    t.start();
 }   
}
