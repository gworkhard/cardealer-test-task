package com.company.cardealer.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s|name")
@Table(name = "CARDEALER_COUNTRY")
@Entity(name = "cardealer_Country")
public class Country extends StandardEntity {
    private static final long serialVersionUID = -5414922046920353239L;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "CODE")
    protected String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}