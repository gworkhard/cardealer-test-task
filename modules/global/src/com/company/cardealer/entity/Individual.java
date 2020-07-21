package com.company.cardealer.entity;

import com.haulmont.chile.core.annotations.NamePattern;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@NamePattern("%s|phoneNumber")
@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
@Table(name = "CARDEALER_INDIVIDUAL")
@Entity(name = "cardealer_Individual")
public class Individual extends Contractor {
    private static final long serialVersionUID = -4778767927696045776L;

    @Column(name = "FIRST_NAME")
    protected String firstName;

    @Column(name = "LAST_NAME")
    protected String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}