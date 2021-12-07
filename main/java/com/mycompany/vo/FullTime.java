/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vo;

/**
 *
 * @author saiye
 */
public class FullTime extends Employee {

    private double annual_salary;

    @Override
    public String toString() {
        return "FullTime{" + "annual_salary=" + annual_salary + "," + super.toString() + '}';
    }

    public FullTime() {
    }

    public FullTime(double annual_salary, int e_id, String e_name, int e_phone, String email) {
        super(e_id, e_name, e_phone, email);
        this.annual_salary = annual_salary;
    }

    public double getAnnual_salary() {
        return annual_salary;
    }

    public void setAnnual_salary(double annual_salary) {
        this.annual_salary = annual_salary;
    }

    public static FullTime ftTest() {

        FullTime branch = null;

        double annual_salary = 50000.0;
        int e_id = 10;
        String e_name = "nil";
        int e_phone = 123456789;
        String email = "abc@abc.com";

        branch = new FullTime(annual_salary, e_id, e_name, e_phone, email);
        System.out.println(branch);

        return branch;
    }

    public boolean validate(double annual_salary, int e_id, String e_name, int e_phone, String email) {
        boolean status = false;
        FullTime branch = FullTime.ftTest();

        if (branch.getAnnual_salary() == (annual_salary) && branch.getE_id() == (e_id) && branch.getE_name().equals(e_name)
                && branch.getE_phone() == (e_phone) && branch.getEmail().equals(email)) {
            return true;
        }
        return status;
    }

}
