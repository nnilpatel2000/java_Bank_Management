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
public class Individual extends Customer {

    private double withdraw_limit;

    @Override
    public String toString() {
        return "Individual{" + "withdraw_limit=" + withdraw_limit + "," + super.toString() + '}';
    }

    public Individual() {
    }

    public Individual(double withdraw_limit, int c_id, String c_name, int c_phone, String c_email, ArrayList<Accounts> accountsList) {
        super(c_id, c_name, c_phone, c_email, accountsList);
        this.withdraw_limit = withdraw_limit;
    }

    public double getWithdraw_limit() {
        return withdraw_limit;
    }

    public void setWithdraw_limit(double withdraw_limit) {
        this.withdraw_limit = withdraw_limit;
    }

    public static Individual ptTest() {

        Individual branch = null;

        double Withdraw_limit = 20000.0;
        int C_id = 10;
        String C_name = "nil";
        int C_phone = 123456788;
        String C_email = "abc@abc.com";
        int account_number = 123123123;
        int routing_number = 123456789;
        double account_balance = 10000.0;
        ArrayList<Accounts> AccountsList = new ArrayList<Accounts>();
        branch = new Individual(Withdraw_limit, C_id, C_name, C_phone, C_email, AccountsList);
        System.out.println(branch);

        return branch;
    }

    public boolean validate(double withdraw_limit, int c_id, String c_name, int c_phone, String c_email, ArrayList<Accounts> AccountsList) {
        boolean status = false;
        Individual branch = Individual.ptTest();

        if (branch.getWithdraw_limit() == (withdraw_limit) && branch.getC_id() == (c_id) && branch.getC_name().equals(c_name)
                && branch.getC_phone() == (c_phone) && branch.getC_email().equals(c_email) && branch.getAccountsList().equals(AccountsList)) {
            return true;
        }
        return status;
    }

}
