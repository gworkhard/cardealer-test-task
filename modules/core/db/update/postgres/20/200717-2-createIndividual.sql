alter table CARDEALER_INDIVIDUAL add constraint FK_CARDEALER_INDIVIDUAL_ON_ID foreign key (ID) references CARDEALER_CONTRACTOR(ID) on delete CASCADE;
