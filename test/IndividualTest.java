/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

import com.mycompany.vo.Accounts;
import com.mycompany.vo.Individual;
import com.mycompany.vo.Savings;
import java.util.ArrayList;
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
public class IndividualTest {
    Individual individual;
    Individual individual1;
    Individual empb;
    Individual individual2 = new Individual();
    
    public IndividualTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        individual = new Individual();
        individual1 = new Individual(5000.00, 4, "Mike", 313313313, "mike@abc.com", individual.getAccountsList());
        empb = new Individual();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testIndividual() {
         
         
         
         individual.setWithdraw_limit(5000.00);
         assertEquals(5000.00, individual.getWithdraw_limit(),0);
         
         individual1.setWithdraw_limit(5000.00);
         assertEquals(5000.00, individual1.getWithdraw_limit(),0);
         
        Individual i = new Individual();
        String individual2 = "Individual{withdraw_limit=0.0,Customer{c_id=0, c_name=null, c_phone=0, c_email=null, accountsList=null}}";
        assertEquals(individual2, i.toString());
     
     }
     
      @Test
    public void hello() {
        assertTrue(empb.validate(20000.0, 10, "nil", 123456788, "abc@abc.com", new ArrayList<Accounts>()));
    }
//

    @Test
    public void hellofalse() {
        assertTrue(!empb.validate(10000.0, 12, "mitul", 4646664, "sfsff", null));
    }

    @Test
    public void validateReturnsFalseWhenAnnualSalaryDoesNotMatch() {
        double Withdraw_limit = 10000.0;
        int C_id = 10;
        String C_name = "nil";
        int C_phone = 123456788;
        String C_email = "abc@abc.com";
        ArrayList<Accounts> AccountsList = new ArrayList<Accounts>();

        org.junit.Assert.assertFalse(individual2.validate(Withdraw_limit, C_id, C_name, C_phone, C_email, AccountsList));
    }
//    

    @Test
    public void validateReturnsFalseWhenIdDoesNotMatch() {
        double Withdraw_limit = 20000.0;
        int C_id = 11;
        String C_name = "nil";
        int C_phone = 123456788;
        String C_email = "abc@abc.com";
        ArrayList<Accounts> AccountsList = new ArrayList<Accounts>();

        org.junit.Assert.assertFalse(individual2.validate(Withdraw_limit, C_id, C_name, C_phone, C_email, AccountsList));

    }
//    
//    

    @Test
    public void validateReturnsFalseWhenNameDoesNotMatch() {
        double Withdraw_limit = 20000.0;
        int C_id = 10;
        String C_name = "mitul";
        int C_phone = 123456788;
        String C_email = "abc@abc.com";
        ArrayList<Accounts> AccountsList = new ArrayList<Accounts>();

        org.junit.Assert.assertFalse(individual2.validate(Withdraw_limit, C_id, C_name, C_phone, C_email, AccountsList));

    }
//    

    @Test
    public void validateReturnsFalseWhenPhoneDoesNotMatch() {
        double Withdraw_limit = 20000.0;
        int C_id = 10;
        String C_name = "nil";
        int C_phone = 223458789;
        String C_email = "abc@abc.com";
        ArrayList<Accounts> AccountsList = new ArrayList<Accounts>();

        org.junit.Assert.assertFalse(individual2.validate(Withdraw_limit, C_id, C_name, C_phone, C_email, AccountsList));

    }
//    

    @Test
    public void validateReturnsFalseWhenEmailDoesNotMatch() {
        double Withdraw_limit = 20000.0;
        int C_id = 10;
        String C_name = "nil";
        int C_phone = 123456788;
        String C_email = "xyz@abc.com";
        ArrayList<Accounts> AccountsList = new ArrayList<Accounts>();

        org.junit.Assert.assertFalse(individual2.validate(Withdraw_limit, C_id, C_name, C_phone, C_email, AccountsList));

    }
//    

    @Test
    public void validateReturnsFalseWhenAccountListDoesNotMatch() {
        double Withdraw_limit = 20000.0;
        int C_id = 10;
        String C_name = "nil";
        int C_phone = 123456788;
        String C_email = "abc@abc.com";
        ArrayList<Accounts> AccountsList = null;

        org.junit.Assert.assertFalse(individual2.validate(Withdraw_limit, C_id, C_name, C_phone, C_email, AccountsList));

    }

    @Test
    public void validateReturnsTrueWhenEverythingMatch() {
        double Withdraw_limit = 20000.0;
        int C_id = 10;
        String C_name = "nil";
        int C_phone = 123456788;
        String C_email = "abc@abc.com";
        ArrayList<Accounts> AccountsList = new ArrayList<Accounts>();

        org.junit.Assert.assertTrue(individual2.validate(Withdraw_limit, C_id, C_name, C_phone, C_email, AccountsList));
    }
}
