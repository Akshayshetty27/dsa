--  subquries in SQL 
SELECT name,
    salary
FROM employees
WHERE salary > (
        SELECT AVG(salary)
        FROM employees
    );


SELECT name,
    salary
FROM employees
where salary < (
        SELECT AVG(salary)
        FROM employees
    );





