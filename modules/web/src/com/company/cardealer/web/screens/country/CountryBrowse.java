package com.company.cardealer.web.screens.country;

import com.haulmont.cuba.gui.screen.*;
import com.company.cardealer.entity.Country;

@UiController("cardealer_Country.browse")
@UiDescriptor("country-browse.xml")
@LookupComponent("countriesTable")
@LoadDataBeforeShow
public class CountryBrowse extends StandardLookup<Country> {
}