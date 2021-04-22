use TUHousing;

ALTER TABLE student
ADD FOREIGN KEY (SSN) REFERENCES tuh_user(SSN);

ALTER TABLE student
ADD COLUMN lease_num int;

ALTER TABLE student
ADD FOREIGN KEY (lease_num) REFERENCES lease(lease_num);

ALTER TABLE tu_admin
ADD COLUMN SSN varchar(9);

ALTER TABLE tu_admin
ADD FOREIGN KEY (SSN) REFERENCES tuh_user(SSN);

ALTER TABLE tu_admin
ADD COLUMN lease_num int;

ALTER TABLE tu_admin
ADD FOREIGN KEY (lease_num) REFERENCES lease(lease_num);

ALTER TABLE lease
ADD COLUMN housing_num int;

ALTER TABLE lease
ADD FOREIGN KEY (housing_num) REFERENCES housing(housing_num);

ALTER TABLE hall_room
ADD COLUMN hall_num int;

ALTER TABLE hall_room
ADD FOREIGN KEY (hall_num) REFERENCES resident_hall(hall_num);

ALTER TABLE apart_room
ADD COLUMN apart_num int;

ALTER TABLE apart_room
ADD FOREIGN KEY (apart_num) REFERENCES apartment(apart_num);

ALTER TABLE apart_parking
ADD COLUMN hall_num int;

ALTER TABLE apart_parking
ADD COLUMN apart_num int;

ALTER TABLE apart_parking
ADD FOREIGN KEY (hall_num) REFERENCES resident_hall(hall_num);

ALTER TABLE apart_parking
ADD FOREIGN KEY (apart_num) REFERENCES apartment(apart_num);

ALTER TABLE resident_parking
ADD COLUMN hall_num int;

ALTER TABLE resident_parking
ADD COLUMN apart_num int;

ALTER TABLE resident_parking
ADD FOREIGN KEY (hall_num) REFERENCES resident_hall(hall_num);

ALTER TABLE resident_parking
ADD FOREIGN KEY (apart_num) REFERENCES apartment(apart_num);

ALTER TABLE apart_meal_plan
ADD COLUMN hall_num int;

ALTER TABLE apart_meal_plan
ADD COLUMN apart_num int;

ALTER TABLE apart_meal_plan
ADD FOREIGN KEY (hall_num) REFERENCES resident_hall(hall_num);

ALTER TABLE apart_meal_plan
ADD FOREIGN KEY (apart_num) REFERENCES apartment(apart_num);

ALTER TABLE resident_meal_plan
ADD COLUMN hall_num int;

ALTER TABLE resident_meal_plan
ADD COLUMN apart_num int;

ALTER TABLE resident_meal_plan
ADD FOREIGN KEY (hall_num) REFERENCES resident_hall(hall_num);

ALTER TABLE resident_meal_plan
ADD FOREIGN KEY (apart_num) REFERENCES apartment(apart_num);