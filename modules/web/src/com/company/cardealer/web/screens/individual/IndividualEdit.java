package com.company.cardealer.web.screens.individual;

import com.haulmont.cuba.gui.screen.*;
import com.company.cardealer.entity.Individual;

@UiController("cardealer_Individual.edit")
@UiDescriptor("individual-edit.xml")
@EditedEntityContainer("individualDc")
@LoadDataBeforeShow
public class IndividualEdit extends StandardEditor<Individual> {
}