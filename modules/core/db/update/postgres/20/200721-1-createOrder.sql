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
);