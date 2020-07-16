package com.company.cardealer.service;

import com.company.cardealer.entity.Country;

public interface CountryService {
    String NAME = "cardealer_CountryService";

    Country getCountryForCurrentUser();
}