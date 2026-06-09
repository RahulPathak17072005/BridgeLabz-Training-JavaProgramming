package CabInvoice;

public class CustomerDetail {
    int id;
    String name;
    String password;
    String phone;
    String email;
    public CustomerDetail(int id, String name,String password,  String phone, String email) {
        this.id=id;
        this.name=name;
        this.phone=phone;
        this.email=email;
        this.password=password;


    }
    public void getDetails(){
        System.out.println("id: " + id + " name: " + name + " Phone: " + phone + " email: " + email + " password: " + password);
    }
}
