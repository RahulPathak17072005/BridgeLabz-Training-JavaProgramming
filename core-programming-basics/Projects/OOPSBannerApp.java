class Banner{
    private String message;
    public Banner(String message){
        this.message=message;
    }
    public void display(){
        System.out.println("***************************");
        System.out.println("* " + message + " *");
        System.out.println("***************************");
    }

}
public class OOPSBannerApp {
public static void main(String[] args) {
    Banner banner=new Banner("Welcome to OOPS Banner");
    Banner banner2=new Banner("Core Programming Basics");
    banner.display();
    banner2.display();

}
}
