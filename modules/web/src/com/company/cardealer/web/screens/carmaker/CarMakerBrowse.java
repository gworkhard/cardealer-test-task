package com.company.cardealer.web.screens.carmaker;

import com.haulmont.cuba.gui.screen.*;
import com.company.cardealer.entity.CarMaker;

@UiController("cardealer_CarMaker.browse")
@UiDescriptor("car-maker-browse.xml")
@LookupComponent("carMakersTable")
@LoadDataBeforeShow
public class CarMakerBrowse extends StandardLookup<CarMaker> {
}