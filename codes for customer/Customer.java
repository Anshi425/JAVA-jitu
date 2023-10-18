package com.app.core;

import java.beans.Customizer;
import java.time.LocalDate;

import java.util.Objects;

public class Customer {
    private int custid;
    private String firstname;
    private String lastname;
    private LocalDate dob;
    private String email;
    private String password;
    private double regamt;
    private ServicePlan plan;  //enum declaration
//    private static int count;


    public Customer(int custid  , String firstname, String lastname, LocalDate dob, String email, String password, double regamt, ServicePlan plan) {
        this.custid = custid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.email = email;
        this.password = password;
        this.regamt = regamt;
        this.plan = plan;
    }

    public Customer(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "customer{" +
                "custid=" + custid +
                ", firstname=" + firstname +
                ", lastname=" + lastname +
                ", dob=" + dob +
                ", email=" + email +
                ", password=" + password +
                ", regamt=" + regamt +
                ", plan=" + plan +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        System.out.println("in customer's equal ");
        if(o instanceof Customer){
            Customer anotherCustomer = (Customer) o;
            return this.email.equals(anotherCustomer.email);
        }
        return false;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
