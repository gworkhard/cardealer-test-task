package com.company.cardealer.web.screens.car;

import com.company.cardealer.entity.CarMaker;
import com.company.cardealer.entity.CarModel;
import com.company.cardealer.entity.Equipment;
import com.haulmont.cuba.core.global.BeanLocator;
import com.haulmont.cuba.core.global.PersistenceHelper;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.components.validation.DecimalMinValidator;
import com.haulmont.cuba.gui.screen.*;
import com.company.cardealer.entity.Car;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.time.LocalDate;

@UiController("cardealer_Car.edit")
@UiDescriptor("car-edit.xml")
@EditedEntityContainer("carDc")
@LoadDataBeforeShow
public class CarEdit extends StandardEditor<Car> {
    @Inject
    private PickerField<CarMaker> carMakerField;
    @Inject
    private PickerField<CarModel> carModelField;
    @Inject
    private PickerField<Equipment> equipmentField;
    @Inject
    private TextField<String> nameField;
    @Inject
    private TextField<BigDecimal> priceField;
    @Inject
    private BeanLocator beanLocator;

    private DecimalMinValidator<BigDecimal> minValidator;


    @Subscribe("equipmentField")
    public void onEquipmentFieldValueChange(HasValue.ValueChangeEvent<Equipment> event) {
        resetNameField();
        if (event.isUserOriginated()) {
            resetPrice();
        }
        resetMinPriceValidator();
    }

    @Subscribe
    public void onInit(InitEntityEvent<Car> event) {
        resetMinPriceValidator();
        if (PersistenceHelper.isNew(event.getEntity())) {
            event.getEntity().setManufactureYear(LocalDate.now().getYear());
        }
    }

    private void resetMinPriceValidator() {
        priceField.removeValidator(minValidator);
        BigDecimal minPrice = equipmentField.getValue() == null
                ? BigDecimal.ZERO
                : equipmentField.getValue().getPrice();
        minValidator = beanLocator.getPrototype(DecimalMinValidator.NAME, minPrice);
        priceField.addValidator(minValidator);
    }

    private void resetPrice() {
        BigDecimal price = equipmentField.getValue() == null ? null : equipmentField.getValue().getPrice();
        priceField.setValue(price);
    }

    private void resetNameField() {
        String carMaker = carMakerField.getValue() == null ? "" : carMakerField.getValue().getName();
        String carModel = carModelField.getValue() == null ? "" : carModelField.getValue().getName();
        String equipment = equipmentField.getValue() == null ? "" : equipmentField.getValue().getName();
        String nameFieldValue = carMaker + ", " + carModel + ", " + equipment;
        nameField.setValue(nameFieldValue);
    }

}