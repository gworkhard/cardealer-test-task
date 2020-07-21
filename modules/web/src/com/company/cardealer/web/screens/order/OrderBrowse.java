package com.company.cardealer.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.company.cardealer.entity.Order;

@UiController("cardealer_Order.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
@LoadDataBeforeShow
public class OrderBrowse extends StandardLookup<Order> {
}