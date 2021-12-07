/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

import com.mycompany.vo.PartTime;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author saiye
 */
public class PartTimeTest {
    PartTime pt;
      PartTime empb;
    PartTime parttime = new PartTime();
    
    
    public PartTimeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        pt = new PartTime(12000.00,3,"Salman",224-242-2424,"salman@abc.com");
          empb = new PartTime();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testPartTime() {
         pt.setAnnual_salary(12000.00);
         assertEquals(12000.00, pt.getAnnual_salary(),0);
         
         
         PartTime pt1 = new PartTime();
         String pt2 = "PartTime{annual_salary=0.0,Employee{e_id=0, e_name=null, e_phone=0, email=null}}";
         assertEquals(pt2, pt1.toString());
         
     
     }
     
      @Test
    public void hello() {
        assertTrue(empb.validate(20000.0, 10, "nil", 123456789, "abc@abc.com"));
    }

    @Test
    public void hellofalse() {
        assertTrue(!empb.validate(10000.0, 12, "mitul", 4646664, "sfsff"));
    }
    
     @Test
    public void validateReturnsFalseWhenAnnualSalaryDoesNotMatch() {
        double annual_salary = 10000.0;
        int e_id = 10;
        String e_name = "nil";
        int e_phone = 123456789;
        String email = "abc@abc.com";
        
        org.junit.Assert.assertFalse(parttime.validate(annual_salary, e_id, e_name, e_phone, email));
       
    }
    
    @Test
    public void validateReturnsFalseWhenIdDoesNotMatch() {
        double annual_salary = 20000.0;
        int e_id = 11;
        String e_name = "nil";
        int e_phone = 123456789;
        String email = "abc@abc.com";
        
        org.junit.Assert.assertFalse(parttime.validate(annual_salary, e_id, e_name, e_phone, email));
       
    }
    
    
    @Test
    public void validateReturnsFalseWhenNameDoesNotMatch() {
        double annual_salary = 20000.0;
        int e_id = 10;
        String e_name = "mitul";
        int e_phone = 123456789;
        String email = "abc@abc.com";
        
        org.junit.Assert.assertFalse(parttime.validate(annual_salary, e_id, e_name, e_phone, email));
       
    }
    
    @Test
    public void validateReturnsFalseWhenPhoneDoesNotMatch() {
        double annual_salary = 20000.0;
        int e_id = 10;
        String e_name = "nil";
        int e_phone = 177456789;
        String email = "abc@abc.com";
        
        org.junit.Assert.assertFalse(parttime.validate(annual_salary, e_id, e_name, e_phone, email));
       
    }
    
    @Test
    public void validateReturnsFalseWhenEmailDoesNotMatch() {
        double annual_salary = 20000.0;
        int e_id = 10;
        String e_name = "nil";
        int e_phone = 123456789;
        String email = "xyz@xyz.com";
        
        org.junit.Assert.assertFalse(parttime.validate(annual_salary, e_id, e_name, e_phone, email));
       
    }
    
    @Test
    public void validateReturnsTrueWhenEverythingMatch() {
        double annual_salary = 20000.0;
        int e_id = 10;
        String e_name = "nil";
        int e_phone = 123456789;
        String email = "abc@abc.com";
        
        org.junit.Assert.assertTrue(parttime.validate(annual_salary, e_id, e_name, e_phone, email));
       
    }
}
