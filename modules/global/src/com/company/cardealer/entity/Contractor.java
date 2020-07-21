package com.company.cardealer.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@NamePattern("%s|phoneNumber")
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "CARDEALER_CONTRACTOR")
@Entity(name = "cardealer_Contractor")
public class Contractor extends StandardEntity {
    private static final long serialVersionUID = 383207265893395591L;

    @Column(name = "PHONE_NUMBER")
    protected String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}