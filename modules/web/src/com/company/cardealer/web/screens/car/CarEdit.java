package com.company.cardealer.web.screens.car;

import com.company.cardealer.entity.CarMaker;
import com.company.cardealer.entity.CarModel;
import com.company.cardealer.entity.Equipment;
import com.haulmont.bali.util.ParamsMap;
import com.haulmont.cuba.core.global.BeanLocator;
import com.haulmont.cuba.core.global.PersistenceHelper;
import com.haulmont.cuba.gui.actions.picker.LookupAction;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.components.validation.DecimalMinValidator;
import com.haulmont.cuba.gui.screen.*;
import com.company.cardealer.entity.Car;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Collection;

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

    @Subscribe("carMakerField")
    public void onCarMakerFieldValueChange(HasValue.ValueChangeEvent<CarMaker> event) {
        carModelField.clear();
        carModelField.setEditable(event.getValue() != null);
    }

    @Subscribe("carModelField")
    public void onCarModelFieldValueChange(HasValue.ValueChangeEvent<CarModel> event) {
        equipmentField.clear();
        equipmentField.setEditable(event.getValue() != null);
    }

    @Subscribe("equipmentField")
    public void onEquipmentFieldValueChange(HasValue.ValueChangeEvent<Equipment> event) {
        resetNameField(event.getValue());
        if (event.isUserOriginated()) {
            resetPrice();
        }
        resetMinPriceValidator();
    }

    @Subscribe
    public void onInit(InitEntityEvent<Car> event) {
        resetMinPriceValidator();
        if (!PersistenceHelper.isNew(event.getEntity())) {
            return;
        }
        event.getEntity().setManufactureYear(LocalDate.now().getYear());
        carModelField.setEditable(false);
        equipmentField.setEditable(false);
    }

    @Install(to = "carModelField.lookup", subject = "screenOptionsSupplier")
    protected ScreenOptions carModelFieldLookupScreenOptionsSupplier() {
        return new MapScreenOptions(ParamsMap.of("carMaker", carMakerField.getValue()));
    }

    @Install(to = "equipmentField.lookup", subject = "screenOptionsSupplier")
    private ScreenOptions equipmentFieldLookupScreenOptionsSupplier() {
        return new MapScreenOptions(ParamsMap.of("carModel", carModelField.getValue()));
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

    private void resetNameField(Equipment eq) {
        if (eq == null) {
            nameField.setValue("");
            return;
        }
        String carMaker = carMakerField.getValue() == null ? "" : carMakerField.getValue().getName();
        String carModel = carModelField.getValue() == null ? "" : carModelField.getValue().getName();
        String equipment = equipmentField.getValue() == null ? "" : equipmentField.getValue().getName();
        String nameFieldValue = carMaker + ", " + carModel + ", " + equipment;
        nameField.setValue(nameFieldValue);
    }

}