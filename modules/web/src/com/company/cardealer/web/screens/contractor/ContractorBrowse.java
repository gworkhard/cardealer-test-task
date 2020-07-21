package com.company.cardealer.web.screens.contractor;

import com.company.cardealer.service.OrdersCountService;
import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.screen.*;
import com.company.cardealer.entity.Contractor;

import javax.inject.Inject;

@UiController("cardealer_Contractor.browse")
@UiDescriptor("contractor-browse.xml")
@LookupComponent("contractorsTable")
@LoadDataBeforeShow
public class ContractorBrowse extends StandardLookup<Contractor> {

    @Inject
    private GroupTable<Contractor> contractorsTable;
    @Inject
    private OrdersCountService ordersCountService;

    public Component generateOrdersQuantityCell(Contractor contractor) {
        int quantity = ordersCountService.getOrdersCountForContractor(contractor);
        return new Table.PlainTextCell(String.valueOf(quantity));
    }

    @Subscribe
    public void onInit(InitEvent event) {
        contractorsTable.addPrintable("quantity",
                contractor -> String.valueOf(ordersCountService.getOrdersCountForContractor(contractor)));
    }


}