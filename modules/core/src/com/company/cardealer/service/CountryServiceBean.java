package com.company.cardealer.service;

import com.company.cardealer.entity.Country;
import com.company.cardealer.entity.ExtUser;
import com.haulmont.cuba.core.global.UserSessionSource;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service(CountryService.NAME)
public class CountryServiceBean implements CountryService {

    @Inject
    private UserSessionSource userSessionSource;

    @Override
    public Country getCountryForCurrentUser() {
        ExtUser extUser = (ExtUser) userSessionSource.getUserSession().getUser();
        Country country = extUser.getCountry() == null ? null /*default country must be here*/ : extUser.getCountry();
        return country;
    }
}