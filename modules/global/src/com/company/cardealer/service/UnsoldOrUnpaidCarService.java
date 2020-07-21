package com.company.cardealer.service;

import com.company.cardealer.entity.Car;

import java.util.List;

public interface UnsoldOrUnpaidCarService {
    String NAME = "cardealer_UnsoldOrUnpaidCarService";

    List<Car> getUnsoldOrUnpaidCars();
}