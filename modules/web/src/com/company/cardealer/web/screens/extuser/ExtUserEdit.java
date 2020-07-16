package com.company.cardealer.web.screens.extuser;

import com.haulmont.cuba.gui.screen.*;
import com.company.cardealer.entity.ExtUser;

@UiController("cardealer_ExtUser.edit")
@UiDescriptor("ext-user-edit.xml")
@EditedEntityContainer("extUserDc")
@LoadDataBeforeShow
public class ExtUserEdit extends StandardEditor<ExtUser> {
}