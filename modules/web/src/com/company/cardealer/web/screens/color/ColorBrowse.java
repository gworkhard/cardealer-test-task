package com.company.cardealer.web.screens.color;

import com.haulmont.cuba.gui.screen.*;
import com.company.cardealer.entity.Color;

@UiController("cardealer_Color.browse")
@UiDescriptor("color-browse.xml")
@LookupComponent("colorsTable")
@LoadDataBeforeShow
public class ColorBrowse extends StandardLookup<Color> {
}