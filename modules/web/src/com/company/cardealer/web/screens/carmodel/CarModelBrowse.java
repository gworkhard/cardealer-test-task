package com.company.cardealer.web.screens.carmodel;

import com.company.cardealer.entity.CarMaker;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.cardealer.entity.CarModel;

import javax.inject.Inject;

@UiController("cardealer_CarModel.browse")
@UiDescriptor("car-model-browse.xml")
@LookupComponent("carModelsTable")
@LoadDataBeforeShow
public class CarModelBrowse extends StandardLookup<CarModel> {

    @Inject
    private CollectionLoader<CarModel> carModelsDl;

    @Subscribe
    public void onInit(InitEvent event) {
        MapScreenOptions options = (MapScreenOptions) event.getOptions();
        CarMaker carMaker = (CarMaker) options.getParams().get("carMaker");
        if (carMaker != null) {
            carModelsDl.setQuery(" select c from cardealer_CarModel c where c.carMaker.id = :carMakerId");
            carModelsDl.setParameter("carMakerId", carMaker.getId());
        }
    }





//    @Inject
//    private CollectionContainer<CarModel> carModelsDc;



}