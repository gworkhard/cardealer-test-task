package com.company.cardealer.web.screens.company;

import com.haulmont.cuba.gui.screen.*;
import com.company.cardealer.entity.Company;

@UiController("cardealer_Company.browse")
@UiDescriptor("company-browse.xml")
@LookupComponent("companiesTable")
@LoadDataBeforeShow
public class CompanyBrowse extends StandardLookup<Company> {
}