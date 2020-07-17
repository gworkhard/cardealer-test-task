package com.company.cardealer.web.screens.equipment;

import com.haulmont.cuba.gui.screen.*;
import com.company.cardealer.entity.Equipment;

@UiController("cardealer_Equipment.edit")
@UiDescriptor("equipment-edit.xml")
@EditedEntityContainer("equipmentDc")
@LoadDataBeforeShow
public class EquipmentEdit extends StandardEditor<Equipment> {
}