package com.company.cardealer.web.screens.individual;

import com.company.cardealer.entity.Contractor;
import com.company.cardealer.service.OrdersCountService;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.screen.*;
import com.company.cardealer.entity.Individual;

import javax.inject.Inject;

@UiController("cardealer_Individual.browse")
@UiDescriptor("individual-browse.xml")
@LookupComponent("individualsTable")
@LoadDataBeforeShow
public class IndividualBrowse extends StandardLookup<Individual> {
    @Inject
    private GroupTable<Individual> individualsTable;
    @Inject
    private OrdersCountService ordersCountService;

    public Component generateOrdersQuantityCell(Contractor contractor) {
        int quantity = ordersCountService.getOrdersCountForContractor(contractor);
        return new Table.PlainTextCell(String.valueOf(quantity));
    }

    @Subscribe
    public void onInit(InitEvent event) {
        individualsTable.addPrintable("quantity",
                contractor -> String.valueOf(ordersCountService.getOrdersCountForContractor(contractor)));
    }
}