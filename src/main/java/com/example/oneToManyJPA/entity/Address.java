package com.example.oneToManyJPA.entity;

import javax.persistence.*;

@Entity(name="address")
public class Address {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="address_id")
  private Integer addressId;
@Column(name="street_name")
  private String streetName;
@Column(name="employee_id",insertable = false,updatable = false)
private Integer employeeId;

    public Address() {
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
}
