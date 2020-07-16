-- begin CARDEALER_COUNTRY
create table CARDEALER_COUNTRY (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    CODE varchar(255),
    --
    primary key (ID)
)^
-- end CARDEALER_COUNTRY
-- begin SEC_USER
alter table SEC_USER add column COUNTRY_ID uuid ^
alter table SEC_USER add column DTYPE varchar(100) ^
update SEC_USER set DTYPE = 'cardealer_ExtUser' where DTYPE is null ^
-- end SEC_USER
-- begin CARDEALER_CAR_MAKER
create table CARDEALER_CAR_MAKER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    COUNTRY_ID uuid,
    CODE varchar(255) not null,
    --
    primary key (ID)
)^
-- end CARDEALER_CAR_MAKER