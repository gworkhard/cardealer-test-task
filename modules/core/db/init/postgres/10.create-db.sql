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
-- begin CARDEALER_CAR_MODEL
create table CARDEALER_CAR_MODEL (
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
    CAR_MAKER_ID uuid,
    --
    primary key (ID)
)^
-- end CARDEALER_CAR_MODEL
-- begin CARDEALER_EQUIPMENT
create table CARDEALER_EQUIPMENT (
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
    PRICE decimal(19, 2),
    CAR_TYPE integer,
    COMMENT_ varchar(1000),
    CAR_MODEL_ID uuid,
    --
    primary key (ID)
)^
-- end CARDEALER_EQUIPMENT
-- begin CARDEALER_CONTRACTOR
create table CARDEALER_CONTRACTOR (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    DTYPE varchar(100),
    --
    PHONE_NUMBER varchar(255),
    --
    primary key (ID)
)^
-- end CARDEALER_CONTRACTOR
-- begin CARDEALER_COMPANY
create table CARDEALER_COMPANY (
    ID uuid,
    --
    OFFICIAL_NAME varchar(255),
    INN_AND_ADDRESS text,
    --
    primary key (ID)
)^
-- end CARDEALER_COMPANY
-- begin CARDEALER_INDIVIDUAL
create table CARDEALER_INDIVIDUAL (
    ID uuid,
    --
    FIRST_NAME varchar(255),
    LAST_NAME varchar(255),
    --
    primary key (ID)
)^
-- end CARDEALER_INDIVIDUAL
-- begin CARDEALER_CAR
create table CARDEALER_CAR (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CAR_MAKER_ID uuid,
    CAR_MODEL_ID uuid,
    EQUIPMENT_ID uuid,
    NAME varchar(255),
    MANUFACTURE_YEAR integer,
    PRICE decimal(19, 2),
    --
    primary key (ID)
)^
-- end CARDEALER_CAR
-- begin CARDEALER_ORDER
create table CARDEALER_ORDER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CAR_ID uuid,
    CONTRACTOR_ID uuid,
    IS_PAID boolean,
    PRICE decimal(19, 2),
    MANAGER_ID uuid,
    --
    primary key (ID)
)^
-- end CARDEALER_ORDER
-- begin CARDEALER_COLOR
create table CARDEALER_COLOR (
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
    CODE varchar(255) not null,
    --
    primary key (ID)
)^
-- end CARDEALER_COLOR
