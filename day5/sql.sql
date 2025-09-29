--1)Write an SQL query to update the age of a student with student_id = 102 to 22 in the Students table.--
UPDATE Students
SET age = 22
WHERE student_id = 102;


--2)Write an SQL query to delete the record of the student with student_id = 103 from the Students table.--
DELETE FROM Students
WHERE student_id = 103;