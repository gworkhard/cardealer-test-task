package com.company.cardealer.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "CARDEALER_CAR_MAKER")
@Entity(name = "cardealer_CarMaker")
public class CarMaker extends StandardEntity {
    private static final long serialVersionUID = 944187749852930571L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    protected String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTRY_ID")
    protected Country country;

    @NotNull
    @Column(name = "CODE", nullable = false, unique = true)
    protected String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}