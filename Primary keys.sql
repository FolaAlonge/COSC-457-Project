use TUHousing;

alter table tuh_user
add constraint PK_SSN primary key (SSN);

alter table student
add constraint PK_id primary key (id);

alter table tu_admin
add constraint PK_id primary key (id);

alter table lease
add constraint PK_lease_num primary key (lease_num);

alter table housing
add constraint PK_housing_num primary key (housing_num);

alter table resident_hall
add constraint PK_hall_num primary key (hall_num);

alter table apartment
add constraint PK_apart_num primary key (apart_num);

alter table hall_room
add constraint PK_room primary key (room);

alter table apart_room
add constraint PK_room primary key (room);

alter table resident_parking
add constraint PK_lot_id primary key (lot_id);

alter table resident_parking
add constraint PK_spot_num primary key (spot_num);

alter table apart_parking
add constraint PK_lot_id primary key (lot_id);

alter table apart_meal_plan
add constraint PK_plan_id primary key (plan_id);

alter table resident_meal_plan
add constraint PK_plan_id primary key (plan_id);
                    