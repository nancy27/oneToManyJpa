package com.example.oneToManyJPA.entity;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CollectionId;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="employee_id")
    private int employeeId;
    @Column(name="employee_name")
    private String employeeName;
    @Column(name="email")
    private String email;
    @Column(name="gender")
    private String gender;
    @OneToMany(cascade = CascadeType.ALL,targetEntity = Address.class)
    @JoinColumn(name="employee_id",referencedColumnName = "employee_id")
    private List<Address> address=new ArrayList<>();

    public Employee() {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }
}
