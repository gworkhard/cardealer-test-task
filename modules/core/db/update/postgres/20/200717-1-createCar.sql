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
);