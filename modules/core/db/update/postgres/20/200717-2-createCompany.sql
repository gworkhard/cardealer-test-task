alter table CARDEALER_COMPANY add constraint FK_CARDEALER_COMPANY_ON_ID foreign key (ID) references CARDEALER_CONTRACTOR(ID) on delete CASCADE;
