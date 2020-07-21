package com.company.cardealer.web.screens.color;

import com.haulmont.cuba.gui.screen.*;
import com.company.cardealer.entity.Color;

@UiController("cardealer_Color.edit")
@UiDescriptor("color-edit.xml")
@EditedEntityContainer("colorDc")
@LoadDataBeforeShow
public class ColorEdit extends StandardEditor<Color> {
}