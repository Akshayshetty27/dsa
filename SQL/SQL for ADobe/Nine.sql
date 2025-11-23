CREATE TABLE Students (
    StudentID INT PRIMARY KEY,
    Name VARCHAR(100),
    Age INT
);

INSERT INTO Students VALUES
(1, 'Akshay', 24),
(2, 'Rahul', 22);

SELECT * FROM Students;

CREATE Index index_age on Students(Age);

--  it helps  faster query  on  age column 

SELECT * FROM Students WHERE Age = 22;

-- NON clustered index 

Create NONCLUSTERED  INDEX  index_name on Students (Name);

--  it helps faster query on Name column

SELECT * FROM Students WHERE Name = 'Akshay';
SELECT * FROM Students WHERE Name = 'Rahul';

--  Composite Index

Create INDEX composite_index on Students(Age, Name);

--  it helps faster query on both Age and Name column
SELECT * FROM Students WHERE Age = 24 AND Name = 'Akshay';

