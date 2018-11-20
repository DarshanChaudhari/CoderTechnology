package com.JunitAssessment3;
import org.junit.*;
import static org.junit.Assert.*;

public class SalaryCalculatorTest {

    SalaryCalculator sc = null;

    @BeforeClass
    public static void setUpClass(){
        System.out.println("Before test Suite");
    }

    @Before
    public void setUp(){
        sc = new SalaryCalculator();
        System.out.println("Before each test case");
    }

    @After
    public  void tearDown(){
        System.out.println("SalaryCalculator object will get destroy");
            sc=null;
    }

    @Test
    public void testTaxCalForBigSal(){
    double tax =  sc.calcTax(350000, 0.085);
        assertEquals(4250,tax, 0);
        System.out.println(" testTaxCalForLessSal \n The Expected Tax : 4250 \n The Actual Tax :"+ tax  );
    }

    @Test
    public void testTaxCalForLessSal(){
        double tax =  sc.calcTax(50000, 0.085);
        assertEquals(4250,tax, 0);
        System.out.println("testTaxCalForLessSal \n The Expected Tax : 4250 \n The Actual Tax :"+ tax  );
    }
}
