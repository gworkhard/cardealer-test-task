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
);