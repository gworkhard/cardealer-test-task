package com.company.cardealer.entity;

import com.haulmont.cuba.core.entity.annotation.Extends;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;

@Extends(User.class)
@Entity(name = "cardealer_ExtUser")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class ExtUser extends User {
    private static final long serialVersionUID = 7642791899654588703L;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "COUNTRY_ID")
    protected Country country;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}