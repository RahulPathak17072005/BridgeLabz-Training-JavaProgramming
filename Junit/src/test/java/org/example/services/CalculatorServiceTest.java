//package org.example.services;
//
//import org.junit.*;
//
//import java.util.Date;
//
//
//////Annotations
////1.@Test
////2.@BeforeClass
////3.@AfterClass
////4.@Before
////5.@After
//public class CalculatorServiceTest {
//// test the method of addTwoNumbers
//int counter=0;
//    //@BeforeClass
//@BeforeClass
//    public static void init(){
//        System.out.println("Before all test cases: ");
//        System.out.println("Started test :"+new Date());
//
//    }
//    @Before
//    public void beforeEachTest(){
//        System.out.println("Before each test case: "+new Date());
//        counter=0;
//    }
//
//
//    @Test  //@Test(timeout=2000) //2sec =2000 mili-sec
//              //Thread.sleep(3000);  gets failed;
//    public void addTwoNumbersTest() {
//    for(int i=1;i<=20;i++){
//        counter+=i;
//    }
//        System.out.println("test for add two numbers: ");
//        //CalculatorService service = new CalculatorService();
//        int result= CalculatorService.addTwoNumber(2,3);
//
//        int Expected=5;
//        System.out.println("Counter for ist Test case:"+counter);
//        Assert.assertEquals(Expected,result);
//
//
//        //actual result
//
//        //expected result
//
//    }
//    @Test
//    public void sumAnyNumberTest() {
//    for(int i=0;i<=100;i++){
//        counter +=i;
//    }
//        System.out.println("test for sum many numbers: ");
//        int result= CalculatorService.sumAnyNumber(2,3,4,5,6,7,8,9);
//
//        int Expected=44;
//        System.out.println("Counter for last Test case:"+counter);
//        Assert.assertEquals(Expected,result);
//
//    }
//    @AfterClass
//    public static  void cleanUp(){
//        System.out.println("After test clean up: ");
//        System.out.println("End test cases :"+new Date());
//    }
//
//}
//
//
//
