-- aggregate  function example
-- sum 
SELECT department,
    SUM(salary) AS total_salary
FROM Employees
GROUP BY department -- avg
SELECT department,
    AVG(salary) AS average_salary
FROM Employees
GROUP BY department;
-- count
SELECT department,
    COUNT(*) AS employee_count
FROM Employees
GROUP BY department;
-- max
SELECT department,
    MAX(salary) AS highest_salary
FROM Employees
GROUP BY department;
-- min
SELECT department,
    MIN(salary) AS lowest_salary
FROM Employees
GROUP BY department;
-- having clause example
SELECT department,
    AVG(salary) AS average_salary
FROM Employees
GROUP BY department
HAVING AVG(salary) > 60000;
-- combined example 
SELECT department,
    COUNT(*) AS employee_count,
    AVG(salary) AS average_salary
FROM Employees
GROUP BY department
HAVING COUNT(*) > 5
    AND AVG(salary) > 50000;