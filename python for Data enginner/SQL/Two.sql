SELECT AVG(salary) as AVG_SALARY
from EMPLOYEES
GROUP BY department;

SELECT MAX(salary) as MAXIUM_SAL
 FROM EMPLOYEES ;


SELECT MAX(salary) as second_highest
from EMPLOYEES where  salary < MAX(salary) ;


