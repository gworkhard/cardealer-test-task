package com.company.cardealer.web.screens.company;

import com.haulmont.cuba.gui.screen.*;
import com.company.cardealer.entity.Company;

@UiController("cardealer_Company.edit")
@UiDescriptor("company-edit.xml")
@EditedEntityContainer("companyDc")
@LoadDataBeforeShow
public class CompanyEdit extends StandardEditor<Company> {
}