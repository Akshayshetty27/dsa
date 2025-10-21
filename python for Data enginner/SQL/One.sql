--  creating  table 
CREATE TABLE EMPLOYEES { employee_id INT PRIMARY KEY,
first_name VARCHAR(50),
last_name VARCHAR(50),
department VARCHAR(50) ,
salary NUMBER 
};



--  inserting data to the   table  
insert into EMPLOYEES (
        employee_id,
        first_name,
        last_name,
        department ,
        salary
    )
VALUES (1, "AKSHAY", "SHETTY", "IT" , 50000),
    (2, "Sudeep", " ", "Manager" ,25000),
    (3, "Joel", "D'souza", "Human Resource" , 75000);



--   displaying  all data  from  the table 
SELECT *
FROM EMPLOYEES;


--  updating  a data 
UPDATE EMPLOYEES
SET first_name = "AKSHAY A"
WHERE employee_id = 1;


SELECT first_name , last_name from  EMPLOYEES  where department="IT" AND salary >20000;