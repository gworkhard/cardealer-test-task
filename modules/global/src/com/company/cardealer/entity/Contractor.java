package com.company.cardealer.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "DTYPE", discriminatorType = DiscriminatorType.STRING)
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