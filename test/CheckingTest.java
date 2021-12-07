/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

import com.mycompany.vo.Checking;
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
public class CheckingTest {

    Checking checking;
     Checking empb;
    Checking checking1 = new Checking();
     

    public CheckingTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        checking = new Checking(1500.00, 12, 1122333447, 01122336, 6500.00);
         empb = new Checking();
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testChecking() {
        checking.setMinimum_balance(1500.00);
        assertEquals(1500.00, checking.getMinimum_balance(), 0);

        Checking c = new Checking();
        String checking1 = "Checking{minimum_balance=0.0,Accounts{c_id=0, account_number=0, routing_number=0, account_balance=0.0}}";
        assertEquals(checking1, c.toString());

    }
    
     @Test
    public void hello() {
        assertTrue(empb.validate(1500.0, 11, 123123123, 123456789, 50000.0));
    }

    @Test
    public void hellofalse() {
        assertTrue(!empb.validate(10000.0, 12, 123453456, 464666432, 30000.0));
    }

    @Test
    public void validateReturnsFalseWhenMinimum_balanceDoesNotMatch() {
        double minimum_balance = 1700.0;
         int c_id = 11;
        int account_number = 123123123;
        int routing_number = 123456789;
        double account_balance = 50000.0;

        org.junit.Assert.assertFalse(checking1.validate(minimum_balance, c_id, account_number, routing_number, account_balance));

    }
    
     @Test
    public void validateReturnsFalseWhenIdDoesNotMatch() {
        double minimum_balance = 1500.0;
         int c_id = 10;
        int account_number = 124653123;
        int routing_number = 123456789;
        double account_balance = 50000.0;

        org.junit.Assert.assertFalse(checking1.validate(minimum_balance, c_id, account_number, routing_number, account_balance));

    }

    @Test
    public void validateReturnsFalseWhenAccount_numberDoesNotMatch() {
        double minimum_balance = 1500.0;
         int c_id = 11;
        int account_number = 124653123;
        int routing_number = 123456789;
        double account_balance = 50000.0;

        org.junit.Assert.assertFalse(checking1.validate(minimum_balance, c_id, account_number, routing_number, account_balance));

    }

    @Test
    public void validateReturnsFalseWhenRouting_numberDoesNotMatch() {
        double minimum_balance = 1500.0;
         int c_id = 11;
        int account_number = 123123123;
        int routing_number = 136556789;
        double account_balance = 50000.0;

        org.junit.Assert.assertFalse(checking1.validate(minimum_balance, c_id, account_number, routing_number, account_balance));

    }

    @Test
    public void validateReturnsFalseWhenAccount_balanceDoesNotMatch() {
        double minimum_balance = 1500.0;
         int c_id = 11;
        int account_number = 123123123;
        int routing_number = 123456789;
        double account_balance = 40000.0;

        org.junit.Assert.assertFalse(checking1.validate(minimum_balance, c_id, account_number, routing_number, account_balance));

    }

    @Test
    public void validateReturnsTrueWhenEverythingMatch() {
            double minimum_balance = 1500.0;
            int c_id = 11;
            int account_number = 123123123;
            int routing_number = 123456789;
            double account_balance = 50000.0;

        
        org.junit.Assert.assertTrue(checking1.validate(minimum_balance, c_id, account_number, routing_number, account_balance));
       
    }
}
