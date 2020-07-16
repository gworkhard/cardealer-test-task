package com.company.cardealer.web.screens.extuser;

import com.haulmont.cuba.gui.screen.*;
import com.company.cardealer.entity.ExtUser;

@UiController("cardealer_ExtUser.browse")
@UiDescriptor("ext-user-browse.xml")
@LookupComponent("extUsersTable")
@LoadDataBeforeShow
public class ExtUserBrowse extends StandardLookup<ExtUser> {
}