package com.company.cardealer.web.screens.country;

import com.haulmont.cuba.gui.screen.*;
import com.company.cardealer.entity.Country;

@UiController("cardealer_Country.edit")
@UiDescriptor("country-edit.xml")
@EditedEntityContainer("countryDc")
@LoadDataBeforeShow
public class CountryEdit extends StandardEditor<Country> {
}