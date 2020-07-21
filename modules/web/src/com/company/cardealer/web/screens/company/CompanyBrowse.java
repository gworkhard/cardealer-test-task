package com.company.cardealer.web.screens.company;

import com.company.cardealer.entity.Contractor;
import com.company.cardealer.service.OrdersCountService;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.screen.*;
import com.company.cardealer.entity.Company;

import javax.inject.Inject;

@UiController("cardealer_Company.browse")
@UiDescriptor("company-browse.xml")
@LookupComponent("companiesTable")
@LoadDataBeforeShow
public class CompanyBrowse extends StandardLookup<Company> {

    @Inject
    private GroupTable<Company> companiesTable;

    @Inject
    private OrdersCountService ordersCountService;

    public Component generateOrdersQuantityCell(Contractor contractor) {
        int quantity = ordersCountService.getOrdersCountForContractor(contractor);
        return new Table.PlainTextCell(String.valueOf(quantity));
    }

    @Subscribe
    public void onInit(InitEvent event) {
        companiesTable.addPrintable("quantity",
                contractor -> String.valueOf(ordersCountService.getOrdersCountForContractor(contractor)));
    }
}