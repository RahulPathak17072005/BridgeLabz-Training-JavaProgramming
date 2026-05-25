package review;
import java.util.*;

public class Utility {
   private ArrayList<AddressBook> addressInfo=new ArrayList<>();
   private final String fileName="AddressBook.txt";
   private FileManager<AddressBook> fileManager=new FileManager<>();


   public void addAddress(AddressBook addressBook){
    addressInfo.add(addressBook);
    System.out.println("Address added successfully: ");

   }
   public void viewAddress(){
    if(addressInfo.isEmpty()){
        System.out.println("No contact found:");
        return;
    } 
    for(AddressBook a:addressInfo){
        a.Display();
    }
   }

   public void modifyAddress(int id,String name,String number,String address){
    for(AddressBook a: addressInfo ){
        if(a.getId()==id){
            a.setName(name);
            a.setNumber(number);
            a.setAddress(address);
            System.out.println("Modified Successfully : ");
            return;
        }
        System.out.println("Id not found: ");
    }
   }
   public void deleteInfo(){
   //Iterator<AddressBook> iterator=new addressInfo.iterator();
   //while(iterator.hasNext()){
    //int id=iterator.next();
   System.out.println("Work in progress !");


   }
   public void saveToFile(){
    fileManager.writeToFile(fileName,addressInfo);
   }


    
}