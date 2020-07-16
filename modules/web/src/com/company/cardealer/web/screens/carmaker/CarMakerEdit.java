package com.company.cardealer.web.screens.carmaker;

import com.company.cardealer.service.CountryService;
import com.haulmont.cuba.gui.screen.*;
import com.company.cardealer.entity.CarMaker;

import javax.inject.Inject;

@UiController("cardealer_CarMaker.edit")
@UiDescriptor("car-maker-edit.xml")
@EditedEntityContainer("carMakerDc")
@LoadDataBeforeShow
public class CarMakerEdit extends StandardEditor<CarMaker> {

    @Inject
    private CountryService countryService;

    @Subscribe
    protected void initCarMakerEdit(InitEntityEvent<CarMaker> initEvent) {
        CarMaker carMaker = initEvent.getEntity();
        carMaker.setCountry(countryService.getCountryForCurrentUser());
    }
}