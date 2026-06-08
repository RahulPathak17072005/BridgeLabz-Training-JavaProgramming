package MultiThreadingWork;

public class AnotherCreateThread extends Thread {
    public void run(){
        System.out.println("...........Create thread using the Thread class extend: ...........");
        for(int i=10;i>=1;i--){
            System.out.println("Reverse Thread using "+ i);
            try{
                Thread.sleep(2000);

            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
    
}
class Main1{
    public static void main(String[] args) {
        AnotherCreateThread d=new AnotherCreateThread();
        d.start();
    }
}
