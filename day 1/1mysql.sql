show databases;
CREATE DATABASE repati_kosam;
USE repati_kosam;
CREATE TABLE Studentsrk (
    student_id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    course VARCHAR(50)
);

select * from Studentsrk;
INSERT INTO Studentsrk (student_id, name, age, course) 
VALUES 
(101, 'Rahul', 20, 'CSE'),
(102, 'Priya', 21, 'ECE'),
(103, 'Amit', 19, 'EEE');