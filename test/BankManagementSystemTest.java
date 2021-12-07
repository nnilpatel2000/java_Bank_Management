/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

import com.mycompany.vo.Accounts;
import com.mycompany.vo.Bank_Management_System;
import com.mycompany.vo.Business;
import com.mycompany.vo.Checking;
import com.mycompany.vo.Customer;
import com.mycompany.vo.Employee;
import com.mycompany.vo.FullTime;
import com.mycompany.vo.Individual;
import com.mycompany.vo.PartTime;
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
public class BankManagementSystemTest {
    Bank_Management_System bms1;
    Bank_Management_System bms2;
    Bank_Management_System bms3;
    Customer c1;
    Customer c2;
    Bank_Management_System empb;
    Bank_Management_System bms = new Bank_Management_System();
    
    public BankManagementSystemTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        bms1 = new Bank_Management_System();
        c2 = new Customer();
        bms2 = new Bank_Management_System("BankOfAmerica","Customer","Amy123","Amy@itexpert123", bms1.getEmployeeList(), bms1.getCustomerList());
         empb = new Bank_Management_System();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testBank_Management_System() {
         ArrayList <Employee> employeeList = new ArrayList <Employee> ();
         Employee emp1 = new PartTime(16000.00, 1, "Nil", 224-225-2626, "nil@abc.com");
         Employee emp3 = new FullTime(35000.00, 11, "Mitul", 847-748-4847, "mitul@xyz.com");
         
         employeeList.add(emp1);
         employeeList.add(emp3);
         bms1.setEmployeeList(employeeList);
         
         ArrayList <Customer> customerList = new ArrayList <Customer> ();
         Customer c1 = new Business(10000.00, 1, "Amy", 212212212, "amy@xyz.com", c2.getAccountsList() );
         Customer c3 = new Individual (5000.00, 4, "Mike", 313313313, "mike@abc.com", c2.getAccountsList());
         
         customerList.add(c1);
         customerList.add(c3);
         bms1.setCustomerList(customerList);
         
         ArrayList <Accounts> accountsList = new ArrayList <Accounts> ();
         Accounts acc1 = new Checking(1500.00, 18, 1122333444, 01122333, 5500.00);
         Accounts acc3 = new Savings (500.00, 19, 1122333445, 01123334, 3500.00);
         
         accountsList.add(acc1);
         accountsList.add(acc3);
         c2.setAccountsList(accountsList);
         
         assertTrue(bms1.getCustomerList().size() == 2);
         assertTrue(bms1.getEmployeeList().size() == 2);
         
         bms1.setBankName("BankOfAmerica");
         assertEquals("BankOfAmerica", bms1.getBankName());
         
         bms1.setUserType("Employee");
         assertEquals("Employee", bms1.getUserType());
         
         bms1.setUsername("nil123");
         assertEquals("nil123", bms1.getUsername());
         
         bms1.setPassword("Nil@itexpert123");
         assertEquals("Nil@itexpert123", bms1.getPassword());
         
         assertEquals("BankOfAmerica", bms2.getBankName());
         assertEquals("Customer", bms2.getUserType());
         assertEquals("Amy123", bms2.getUsername());
         assertEquals("Amy@itexpert123", bms2.getPassword());
         bms2.setEmployeeList(employeeList);
         bms2.setCustomerList(customerList);
         
         Bank_Management_System bms4 = new Bank_Management_System();
         String bms5 = "Bank_Management_System{bankName=null, userType=null, username=null, password=null, employeeList=null, customerList=null}";
         assertEquals(bms5, bms4.toString());
         
         
     
     }
     
     @Test
    public void hello() {
        assertTrue(empb.validate("Chase", "Employee", "itexps", "itexps123", new ArrayList<Employee>(), new ArrayList<Customer>()));
    }
//

    @Test
    public void hellofalse() {
        assertTrue(!empb.validate("usbank", "customer", "itexpsit", "itexps1234", null, null));
    }

    @Test
    public void validateReturnsFalseWhenbankNameDoesNotMatch() {
              String bankName = "usbank";
            String userType = "Employee";
            String username = "itexps";
            String password = "itexps123";
            ArrayList<Employee> EmployeeList = new ArrayList<Employee>();
            ArrayList<Customer> CustomerList = new ArrayList<Customer>();
        org.junit.Assert.assertFalse(bms.validate(bankName, userType, username, password, EmployeeList, CustomerList));
    }
//    

    @Test
    public void validateReturnsFalseWhenuserTypeDoesNotMatch() {
              String bankName = "Chase";
            String userType = "customer";
            String username = "itexps";
            String password = "itexps123";
            ArrayList<Employee> EmployeeList = new ArrayList<Employee>();
            ArrayList<Customer> CustomerList = new ArrayList<Customer>();

        org.junit.Assert.assertFalse(bms.validate(bankName, userType, username, password, EmployeeList, CustomerList));

    }
//    
//    

    @Test
    public void validateReturnsFalseWhenusernameDoesNotMatch() {
             String bankName = "Chase";
            String userType = "Employee";
            String username = "itexpsit";
            String password = "itexps123";
            ArrayList<Employee> EmployeeList = new ArrayList<Employee>();
            ArrayList<Customer> CustomerList = new ArrayList<Customer>();
        org.junit.Assert.assertFalse(bms.validate(bankName, userType, username, password, EmployeeList, CustomerList));

    }
//    

    @Test
    public void validateReturnsFalseWhenpasswordDoesNotMatch() {
             String bankName = "Chase";
            String userType = "Employee";
            String username = "itexps";
            String password = "itexps1234";
            ArrayList<Employee> EmployeeList = new ArrayList<Employee>();
            ArrayList<Customer> CustomerList = new ArrayList<Customer>();

        org.junit.Assert.assertFalse(bms.validate(bankName, userType, username, password, EmployeeList, CustomerList));

    }
//    

    @Test
    public void validateReturnsFalseWhenEmployeeListDoesNotMatch() {
              String bankName = "Chase";
            String userType = "Employee";
            String username = "itexps";
            String password = "itexps123";
            ArrayList<Employee> EmployeeList = null;
            ArrayList<Customer> CustomerList = new ArrayList<Customer>();

        org.junit.Assert.assertFalse(bms.validate(bankName, userType, username, password, EmployeeList, CustomerList));

    }
//    

    @Test
    public void validateReturnsFalseWhenCustomerListDoesNotMatch() {
             String bankName = "Chase";
            String userType = "Employee";
            String username = "itexps";
            String password = "itexps123";
            ArrayList<Employee> EmployeeList = new ArrayList<Employee>();
            ArrayList<Customer> CustomerList = null;

        org.junit.Assert.assertFalse(bms.validate(bankName, userType, username, password, EmployeeList, CustomerList));

    }

    @Test
    public void validateReturnsTrueWhenEverythingMatch() {
            String bankName = "Chase";
            String userType = "Employee";
            String username = "itexps";
            String password = "itexps123";
            ArrayList<Employee> EmployeeList = new ArrayList<Employee>();
            ArrayList<Customer> CustomerList = new ArrayList<Customer>();

        org.junit.Assert.assertTrue(bms.validate(bankName, userType, username, password, EmployeeList, CustomerList));
    }
}
