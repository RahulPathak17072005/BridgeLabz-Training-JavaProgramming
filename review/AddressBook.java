package review;
public class AddressBook{
    private int id;
private String name;
private String number;
private String address;
public AddressBook(int id,String name,String number,String address){
    this.id=id;
    this.name=name;
    this.number=number;
    this.address=address;
}

public int getId(){
    return id;
}
public String getName(){
   return name;
}
public String getNumber(){
    return number;
}
public String getAddress(){
    return address;
}
public void setName(String name){
    this.name=name;
}
public void setNumber(String number){
    this.number=number;
}
public void setAddress(String address){
    this.address=address;
}

@Override
public String toString(){
    return "Id: "+id+ "Name : "+name+ "Number : " +number+ "address : "+address;
}

public void Display(){
    System.out.println("your id : "+ id);
    System.out.println("Your Name: " +name);
    System.out.println("Your mobileNumber: " +number);
    System.out.println("Your address: " +address);
}
    
}