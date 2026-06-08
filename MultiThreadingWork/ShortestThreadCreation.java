package MultiThreadingWork;



public class ShortestThreadCreation {
    public static void main(String[] args) {
         new Thread(() -> {
            System.out.println("Running the thread in shorted manner: ");
        }).start();
        }
            
    }
