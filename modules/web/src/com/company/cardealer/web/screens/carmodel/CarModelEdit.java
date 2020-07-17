package com.company.cardealer.web.screens.carmodel;

import com.haulmont.cuba.gui.screen.*;
import com.company.cardealer.entity.CarModel;

@UiController("cardealer_CarModel.edit")
@UiDescriptor("car-model-edit.xml")
@EditedEntityContainer("carModelDc")
@LoadDataBeforeShow
public class CarModelEdit extends StandardEditor<CarModel> {
}