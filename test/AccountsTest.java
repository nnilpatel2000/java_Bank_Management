/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

import com.mycompany.vo.Accounts;
import com.mycompany.vo.Checking;
import com.mycompany.vo.Savings;
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
public class AccountsTest {

    Accounts acc1;
    Accounts acc2;
    Accounts acc3;
    Accounts empb;
    Accounts accounts = new Accounts();

    public AccountsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        acc1 = new Checking(1500.00, 10, 1122333444, 01122333, 5500.00);
        acc2 = new Savings(500.00, 11, 1122333445, 01123334, 3500.00);
        acc3 = new Accounts();
        empb = new Accounts();
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testAccounts() {
       
        assertEquals(10, acc1.getC_id());
        assertEquals(11, acc2.getC_id());

        assertEquals(1122333444, acc1.getAccount_number());
        assertEquals(1122333445, acc2.getAccount_number());

        assertEquals(01122333, acc1.getRouting_number());
        assertEquals(01123334, acc2.getRouting_number());

        assertEquals(5500.00, acc1.getAccount_balance(), 0);
        assertEquals(3500.00, acc2.getAccount_balance(), 0);

        assertEquals(1500.00, ((Checking) acc1).getMinimum_balance(), 0);
        assertEquals(500.00, ((Savings) acc2).getMinimum_balance(), 0);
        
        acc1.setC_id(10);
        assertEquals(10, acc1.getC_id());

        acc3.setAccount_number(1122333446);
        assertEquals(1122333446, acc3.getAccount_number());

        acc3.setRouting_number(01122335);
        assertEquals(01122335, acc3.getRouting_number());

        acc3.setAccount_balance(4500.00);
        assertEquals(4500.00, acc3.getAccount_balance(), 0);

        Accounts acc4 = new Accounts();
        String acc5 = "Accounts{c_id=0, account_number=0, routing_number=0, account_balance=0.0}";
        assertEquals(acc5, acc4.toString());

    }
    
    @Test
    public void hello() {
        assertTrue(empb.validate(10,123123123, 123456789, 50000.0));
    }

    @Test
    public void hellofalse() {
        assertTrue(!empb.validate(11,123453456, 464666432, 30000.0));
    }
    
     @Test
    public void validateReturnsFalseWhenc_idDoesNotMatch() {
        int c_id = 11;
        int account_number = 123123123;
        int routing_number = 123456789;
        double account_balance = 50000.0;

        org.junit.Assert.assertFalse(accounts.validate(c_id, account_number, routing_number, account_balance));

    }

    @Test
    public void validateReturnsFalseWhenAccount_numberDoesNotMatch() {
        int c_id = 10;
        int account_number = 124653123;
        int routing_number = 123456789;
        double account_balance = 50000.0;

        org.junit.Assert.assertFalse(accounts.validate(c_id, account_number, routing_number, account_balance));

    }

    @Test
    public void validateReturnsFalseWhenRouting_numberDoesNotMatch() {
        int c_id = 10;
        int account_number = 123123123;
        int routing_number = 136556789;
        double account_balance = 50000.0;

        org.junit.Assert.assertFalse(accounts.validate(c_id, account_number, routing_number, account_balance));

    }

    @Test
    public void validateReturnsFalseWhenAccount_balanceDoesNotMatch() {
        int c_id = 10;
        int account_number = 123123123;
        int routing_number = 123456789;
        double account_balance = 40000.0;

        org.junit.Assert.assertFalse(accounts.validate(c_id, account_number, routing_number, account_balance));

    }

    @Test
    public void validateReturnsTrueWhenEverythingMatch() {
        int c_id = 10;
        int account_number = 123123123;
        int routing_number = 123456789;
        double account_balance = 50000.0;

        org.junit.Assert.assertTrue(accounts.validate(c_id, account_number, routing_number, account_balance));

    }

}
