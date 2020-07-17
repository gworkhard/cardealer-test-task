package com.company.cardealer.web.screens.carmodel;

import com.haulmont.cuba.gui.screen.*;
import com.company.cardealer.entity.CarModel;

@UiController("cardealer_CarModel.browse")
@UiDescriptor("car-model-browse.xml")
@LookupComponent("carModelsTable")
@LoadDataBeforeShow
public class CarModelBrowse extends StandardLookup<CarModel> {
}