package com.company.cardealer.web.screens.individual;

import com.haulmont.cuba.gui.screen.*;
import com.company.cardealer.entity.Individual;

@UiController("cardealer_Individual.browse")
@UiDescriptor("individual-browse.xml")
@LookupComponent("individualsTable")
@LoadDataBeforeShow
public class IndividualBrowse extends StandardLookup<Individual> {
}