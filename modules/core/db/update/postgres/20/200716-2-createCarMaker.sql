alter table CARDEALER_CAR_MAKER add constraint FK_CARDEALER_CAR_MAKER_ON_COUNTRY foreign key (COUNTRY_ID) references CARDEALER_COUNTRY(ID);
create unique index IDX_CARDEALER_CAR_MAKER_UK_NAME on CARDEALER_CAR_MAKER (NAME) where DELETE_TS is null ;
create unique index IDX_CARDEALER_CAR_MAKER_UK_CODE on CARDEALER_CAR_MAKER (CODE) where DELETE_TS is null ;
create index IDX_CARDEALER_CAR_MAKER_ON_COUNTRY on CARDEALER_CAR_MAKER (COUNTRY_ID);
