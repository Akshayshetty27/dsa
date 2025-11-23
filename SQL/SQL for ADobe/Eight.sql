-- Indexing in sql 
-- Indexing  primaily helps to perform Faster Query operations . And  join operations etc. 
--  Syntax 
CREATE CLUSRED INDEX index_name on table_name (column_name);
--  consider we have  table Employee
--  emp_id | emp_name | emp_age
--  1      |  John    |   30
--  2      |  Alice   |   28
-- 3      |  Bob     |   35



--  Example
-- Emplotyee table 

Create Clustered Index index_id on Employee(emp_id);

--  Now if we perform a select query on emp_id column it will be faster due to indexing
SELECT * FROM Employee WHERE emp_id = 2;


--  2) Non Clustered Index :
--  Does not  affect actual Physcical order of the table.

-- Syntax 
CREATE NONCLUSTERED INDEX index_name on table_name 
(column_name);

-- Example 
--  Employee table with last name column
-- emp_id | emp_name | emp_age | emp_lastname
-- 1      |  John    |   30    |  Doe
-- 2      |  Alice   |   28    |  Smith
-- 3      |  Bob     |   35    |  Johnson

CREATE NONCLUSTERED INDEX index_lastname on Employee(emp_lastname);

--  Now it improves Query perform we do on emp_lastname column
SELECT * FROM Employee WHERE emp_lastname = 'Smith';

--  Note :
-- 1) A table can have only one clustered index but multiple non clustered indexes.



--  Composite Index :
--  Indexing where we include multiple column s in the index . 
--  The order matter here  , i.e (COL1, COL2 ) != (col2, col1)

--  SYntax 
Create INDEX  index_name on table_name (column1, column2);

--  Example : 

CREATE INDEX composite_index on Employee(emp_age, emp_lastname);

--  Now it will help in queries involving both emp_age and emp_lastname

SELECT * FROM Employee WHERE emp_age = 30 AND emp_lastname = 'Doe';

--  Note :
-- Composite indexes are particularly useful for queries that filter or sort based on multiple columns.

