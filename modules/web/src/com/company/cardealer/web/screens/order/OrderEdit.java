package com.company.cardealer.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.company.cardealer.entity.Order;

@UiController("cardealer_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {
}