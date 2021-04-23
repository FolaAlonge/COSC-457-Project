create database TUHousing;
create table TUH_user(Fname char,
					Lname char,
                    email char,
                    phone int(10),
                    SSN int(9),
                    Street_address char,
                    zip int,
                    state char(2));

create table Student(Num_of_courses int,
					credits int,
                    id int,
                    tu_Status char);
                    
create table TU_Admin(id int,
                    tu_position char);

create table lease(length int,
				   lease_date char,
				   lease_num int);
                   
create table housing(housing_num int,
				   manager char,
				   school_year int,
                   address char,
                   zip int,
                   state char(2),
                   city char);

create table Resident_hall(want_parking bool,
				   price double,
				   hall_num int,
                   phone_num int,
                   num_of_rooms int,
                   resident_name char);

create table hall_room(hall_floor int,
				   room int,
				   num_or_beds int);
                   
create table resident_parking(lot_name char,
				   spot_num int,
				   lot_id int);
                   
create table resident_meal_plan(price double,
				   plan_id int,
				   meal_desc char,
                   student_name char);
                   
create table apartment(want_meal bool,
				   want_parking bool,
				   price double,
				   apart_num int,
                   phone_num int,
                   apartment_name char);
                   
create table apart_room(apart_floor int,
				   room int,
				   num_or_beds int,
                   num_of_baths int);
                   
create table apart_parking(lot_name char,
				   spot_num int,
				   lot_id int);

create table apart_meal_plan(price double,
				   plan_id int,
				   meal_desc char,
                   student_name char);
use TUHousing;