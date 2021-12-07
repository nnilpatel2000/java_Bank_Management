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
public class Customer {

    int c_id;
    String c_name;
    int c_phone;
    String c_email;

    private ArrayList<Accounts> accountsList;

    @Override
    public String toString() {
        return "Customer{" + "c_id=" + c_id + ", c_name=" + c_name + ", c_phone=" + c_phone + ", c_email=" + c_email + ", accountsList=" + accountsList + '}';
    }

    public Customer() {
    }

    public Customer(int c_id, String c_name, int c_phone, String c_email, ArrayList<Accounts> accountsList) {
        this.c_id = c_id;
        this.c_name = c_name;
        this.c_phone = c_phone;
        this.c_email = c_email;
        this.accountsList = accountsList;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public int getC_phone() {
        return c_phone;
    }

    public void setC_phone(int c_phone) {
        this.c_phone = c_phone;
    }

    public String getC_email() {
        return c_email;
    }

    public void setC_email(String c_email) {
        this.c_email = c_email;
    }

    public ArrayList<Accounts> getAccountsList() {
        return accountsList;
    }

    public void setAccountsList(ArrayList<Accounts> accountsList) {
        this.accountsList = accountsList;
    }

    public static Customer cTest() {

        Customer branch = null;

        int c_id = 10;
        String c_name = "nil";
        int c_phone = 123456788;
        String c_email = "abc@abc.com";
//            int account_number = 123123123;
//            int routing_number = 123456789;
//            double account_balance = 10000.0;
        ArrayList<Accounts> AccountsList = new ArrayList<Accounts>();
//            Accounts acc9 = new Accounts(account_number, routing_number, account_balance);
        branch = new Customer(c_id, c_name, c_phone, c_email, AccountsList);
        System.out.println(branch);

        return branch;
    }

    public boolean validate(int c_id, String c_name, int c_phone, String c_email, ArrayList<Accounts> AccountsList) {
        boolean status = false;
        Customer branch = Customer.cTest();

        if (branch.getC_id() == (c_id) && branch.getC_name().equals(c_name)
                && branch.getC_phone() == (c_phone) && branch.getC_email().equals(c_email) && branch.getAccountsList().equals(AccountsList)) {
            return true;
        }
        return status;
    }

}
