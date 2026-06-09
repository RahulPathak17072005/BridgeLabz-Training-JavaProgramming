package CabInvoiceTest;
import CabInvoice.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CabInvoiceTesting {

            @BeforeAll
            public static void setUp(){
        System.out.println("Test Case validation started: ");
    }


    FareGenerator generator =new FareGenerator();
    @Test
    void normalRideFareTest(){
        //time,type,distance
        Ride ride=new Ride(5,"Normal",25);
        Assertions.assertEquals(255,generator.calculateFare(ride));
    }
    @Test
    void premiumRideFareTest(){
        Ride ride=new Ride(5,"Premium",25);
        Assertions.assertEquals(385,generator.calculateFare(ride));
    }
    ValidateDetails valid=new ValidateDetails();
    @Test
    void userEmailValidationTest(){
String mail="rahul.pathak_cs22@gla.ac.in";
        Assertions.assertTrue(valid.ValidationEmail(mail));
    }

    @Test
    void userPasswordValidationTest(){
        String pass="Rahul@123";
        Assertions.assertTrue(valid.ValidationPassword(pass));
    }

    @AfterAll
    public static void tearDown(){
        System.out.println("Test Case validation finished: ");
    }




}
