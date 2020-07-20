package com.company.cardealer.service;

import com.company.cardealer.entity.CarMaker;

public interface CarMakerModelsService {
    String NAME = "cardealer_CarMakerModelsService";
    Integer getCarMakerModelsQuantity(CarMaker carMaker);
}