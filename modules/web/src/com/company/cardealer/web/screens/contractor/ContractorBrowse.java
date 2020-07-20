package com.company.cardealer.web.screens.contractor;

import com.haulmont.cuba.gui.screen.*;
import com.company.cardealer.entity.Contractor;

@UiController("cardealer_Contractor.browse")
@UiDescriptor("contractor-browse.xml")
@LookupComponent("contractorsTable")
@LoadDataBeforeShow
public class ContractorBrowse extends StandardLookup<Contractor> {
}