CREATE DATABASE TUHousing;
USE TUHousing;
CREATE TABLE TUH_user(Fname char(20),
					Lname char(20),
                    email char(20),
                    phone int,
                    Ssn int,
                    Street_address char(30),
                    zip int,
                    state char(2),
					PRIMARY KEY(Ssn)	
);

CREATE TABLE Student(Num_of_courses int,
					credits int,
                    Student_id int,
                    tu_Status char,
                    Lease_num int,
                    Ssn int,
                    Plan_id int,
                    Permit_id int,
                    Want_parking bool,
                    PRIMARY KEY (Student_id),
					UNIQUE (Lease_num),
                    FOREIGN KEY(Ssn) REFERENCES TUH_user(Ssn),
                    FOREIGN KEY (lease_num) REFERENCES lease(lease_num),
                    FOREIGN KEY (Plan_id) REFERENCES meal_plan(Plan_id),
                    FOREIGN KEY (Permit_id) REFERENCES parking(Permit_id)
);
                    
CREATE TABLE TU_Admin(
	id int, 
	Username char(20),
    Passw char(20),
	tu_position char(15),
    Ssn int,
    PRIMARY KEY(id),
    FOREIGN KEY (Ssn) REFERENCES TUH_user(Ssn)
    );

CREATE TABLE lease(length char(10),
				   lease_date DATE,
				   lease_num int NOT NULL AUTO_INCREMENT,
                   Housing_num int,
                   Bed_id char(6),
                   PRIMARY KEY(lease_num),
				   FOREIGN KEY (Housing_num) REFERENCES housing(housing_num),
                   FOREIGN KEY (Bed_id) REFERENCES hall_bed(Bed_id),
                   FOREIGN KEY (Bed_id) REFERENCES apart_bed(Bed_id)
                   );
                   
CREATE TABLE housing(Housing_num int,
				   Manager char(5),
				   School_year char(10),
                   Address char(15),
                   Zip int,
                   State char(2),
                   City char(15),
                   PRIMARY KEY (Housing_num)
                   );


CREATE TABLE Resident_hall(
				   Price double(5, 2),
				   Hall_num int,
                   Phone_num char(15),
                   Num_of_rooms int,
                   Resident_hall_name char(15),
                   PRIMARY KEY(Hall_num),
                   FOREIGN KEY (Hall_num) REFERENCES housing(housing_num)
                   );

CREATE TABLE hall_bed(Hall_floor int,
				   Room_num int,
				   Num_of_beds int,
                   Hall_num int,
                   Bed_id char(6),
                   PRIMARY KEY(Bed_id),
                   FOREIGN KEY (Hall_num) REFERENCES Resident_hall(Hall_num)
                   );

CREATE TABLE apartment(
				   Price double(4, 2),
				   Apart_num int,
                   Phone_num char(15),
                   Apartment_name char(15),
                   PRIMARY KEY(Apart_num),
                   FOREIGN KEY (Apart_num) REFERENCES housing(housing_num)
                   );
                   
CREATE TABLE apart_bed(Apart_floor int,
				   Room_num int,
				   Num_of_beds int,
                   Num_of_baths int,
                   Apart_num int,
                   Bed_id char(6),
                   PRIMARY KEY(Bed_id),
                   FOREIGN KEY (Apart_num) REFERENCES Resident_hall(Apart_num)
                   );

                   
CREATE TABLE parking(Car_model char(15),
				   Car_color int,
				   Permit_id int,
                   PRIMARY KEY (Permit_id),
                   FOREIGN KEY (Permit_id) REFERENCES Student(Permit_id)
                   );
                   
CREATE TABLE meal_plan(Price double(4, 2),
				   Plan_id int,
                   Meal_name char(10),
                   PRIMARY KEY(Plan_id),
                   FOREIGN KEY(Plan_id) REFERENCES Student(Plan_id)
                   );
                   

                   

