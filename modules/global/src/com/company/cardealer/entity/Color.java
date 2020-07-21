package com.company.cardealer.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "CARDEALER_COLOR")
@Entity(name = "cardealer_Color")
public class Color extends StandardEntity {
    private static final long serialVersionUID = -6200677494615470159L;

    @Column(name = "NAME", nullable = false, unique = true)
    protected @NotNull String name;

    @NotNull
    @Column(name = "CODE", nullable = false, unique = true)
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