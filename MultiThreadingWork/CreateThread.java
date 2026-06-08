package MultiThreadingWork;

public class CreateThread implements Runnable{
    public void run(){
        System.out.println("Thread creating started");
        for(int i=1;i<=10;i++){
            System.out.println("The value of 'i' id: "+i);
            try{
                Thread.sleep(1000);

            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
}
class Main{
    public static void main(String[] args) {
        CreateThread d=new CreateThread();
        Thread t=new Thread(d);
        t.start();
    }
}
