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

select * from TUH_user;
select * from Student;
select * from TU_Admin;
                    
                      