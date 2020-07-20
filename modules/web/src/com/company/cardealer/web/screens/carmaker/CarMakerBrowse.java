package com.company.cardealer.web.screens.carmaker;

import com.company.cardealer.service.CarMakerModelsService;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.screen.*;
import com.company.cardealer.entity.CarMaker;

import javax.inject.Inject;

@UiController("cardealer_CarMaker.browse")
@UiDescriptor("car-maker-browse.xml")
@LookupComponent("carMakersTable")
@LoadDataBeforeShow
public class CarMakerBrowse extends StandardLookup<CarMaker> {

    @Inject
    private CarMakerModelsService carMakerModelsService;

    public Component generateCarMakerModelQuantityCell(CarMaker carMaker) {
        int quantity = carMakerModelsService.getCarMakerModelsQuantity(carMaker);
        return new Table.PlainTextCell(String.valueOf(quantity));
    }
}