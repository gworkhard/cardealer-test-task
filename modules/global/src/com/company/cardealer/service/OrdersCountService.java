package com.company.cardealer.service;

import com.company.cardealer.entity.Contractor;

public interface OrdersCountService {
    String NAME = "cardealer_OrdersCountService";

    Integer getOrdersCountForContractor(Contractor contractor);
}