package com.company.cardealer.entity;

import javax.persistence.*;

@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
@Table(name = "CARDEALER_COMPANY")
@Entity(name = "cardealer_Company")
public class Company extends Contractor {
    private static final long serialVersionUID = 2106826995710605749L;

    @Column(name = "OFFICIAL_NAME")
    protected String officialName;

    @Lob
    @Column(name = "INN_AND_ADDRESS")
    protected String innAndAddress;

    public String getInnAndAddress() {
        return innAndAddress;
    }

    public void setInnAndAddress(String innAndAddress) {
        this.innAndAddress = innAndAddress;
    }

    public String getOfficialName() {
        return officialName;
    }

    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }
}