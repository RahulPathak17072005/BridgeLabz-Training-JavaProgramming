package MultiThreadingWork;
public class ThreadPriorities extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName()+ " priority is: "+Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        ThreadPriorities high=new ThreadPriorities();
        ThreadPriorities low=new ThreadPriorities();

        high.setName("High priorities: ");
        low.setName("Low Priorities : ");


        high.setPriority(Thread.MAX_PRIORITY);
        low.setPriority(Thread.MIN_PRIORITY);

        high.start();
        low.start();

    }


    
}