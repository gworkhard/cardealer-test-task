package com.company.cardealer.web.screens.car;

import com.haulmont.cuba.gui.screen.*;
import com.company.cardealer.entity.Car;

@UiController("cardealer_Car.browse")
@UiDescriptor("car-browse.xml")
@LookupComponent("carsTable")
@LoadDataBeforeShow
public class CarBrowse extends StandardLookup<Car> {

}