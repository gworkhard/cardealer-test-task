package com.company.cardealer.web.screens.equipment;

import com.company.cardealer.entity.CarMaker;
import com.company.cardealer.entity.CarModel;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.cardealer.entity.Equipment;

import javax.inject.Inject;

@UiController("cardealer_Equipment.browse")
@UiDescriptor("equipment-browse.xml")
@LookupComponent("equipmentsTable")
@LoadDataBeforeShow
public class EquipmentBrowse extends StandardLookup<Equipment> {

    @Inject
    private CollectionLoader<Equipment> equipmentsDl;

    @Subscribe
    public void onInit(InitEvent event) {
        MapScreenOptions options = (MapScreenOptions) event.getOptions();
        CarModel carModel = (CarModel) options.getParams().get("carModel");
        if (carModel != null) {
            equipmentsDl.setQuery(" select e from cardealer_Equipment e where e.carModel.id = :carModelId");
            equipmentsDl.setParameter("carModelId", carModel.getId());
        }
    }
}