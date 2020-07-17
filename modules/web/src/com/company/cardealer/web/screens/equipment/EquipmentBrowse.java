package com.company.cardealer.web.screens.equipment;

import com.haulmont.cuba.gui.screen.*;
import com.company.cardealer.entity.Equipment;

@UiController("cardealer_Equipment.browse")
@UiDescriptor("equipment-browse.xml")
@LookupComponent("equipmentsTable")
@LoadDataBeforeShow
public class EquipmentBrowse extends StandardLookup<Equipment> {
}