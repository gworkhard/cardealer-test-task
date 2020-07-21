create unique index IDX_CARDEALER_COLOR_UK_NAME on CARDEALER_COLOR (NAME) where DELETE_TS is null ;
create unique index IDX_CARDEALER_COLOR_UK_CODE on CARDEALER_COLOR (CODE) where DELETE_TS is null ;
