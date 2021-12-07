/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vo;

import java.util.ArrayList;

/**
 *
 * @author saiye
 */
public class Bank_Management_System {

    private String bankName;
    private String userType;
    private String username;
    private String password;

    private ArrayList<Employee> employeeList;
    private ArrayList<Customer> customerList;

    @Override
    public String toString() {
        return "Bank_Management_System{" + "bankName=" + bankName + ", userType=" + userType + ", username=" + username + ", password=" + password + ", employeeList=" + employeeList + ", customerList=" + customerList + '}';
    }

    public Bank_Management_System() {
    }

    public Bank_Management_System(String bankName, String userType, String username, String password, ArrayList<Employee> employeeList, ArrayList<Customer> customerList) {
        this.bankName = bankName;
        this.userType = userType;
        this.username = username;
        this.password = password;
        this.employeeList = employeeList;
        this.customerList = customerList;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    public static Bank_Management_System aTest() {

        Bank_Management_System branch = null;

        String bankName = "Chase";
        String userType = "Employee";
        String username = "itexps";
        String password = "itexps123";
        ArrayList<Employee> EmployeeList = new ArrayList<Employee>();
        ArrayList<Customer> CustomerList = new ArrayList<Customer>();

        branch = new Bank_Management_System(bankName, userType, username, password, EmployeeList, CustomerList);
        System.out.println(branch);

        return branch;
    }

    public boolean validate(String bankName, String userType, String username, String password, ArrayList<Employee> employeeList, ArrayList<Customer> customerList) {
        boolean status = false;
        Bank_Management_System branch = Bank_Management_System.aTest();

        if (branch.getBankName().equalsIgnoreCase(bankName) && branch.getUserType().equalsIgnoreCase(userType)
                && branch.getUsername().equalsIgnoreCase(username) && branch.getPassword().equalsIgnoreCase(password)
                && branch.getEmployeeList().equals(employeeList) && branch.getCustomerList().equals(customerList)) {
            return true;
        }
        return status;
    }

}
