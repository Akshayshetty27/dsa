--  join 
Select e.e_name,
    d.d_name,
    e.salary
from Employees e
    join Departments d on e.department_id = d.department_id;
-- left join
Select e.e_name,
    d.d_name,
    e.salary
from Employees e
    left join Departments d on e.department_id = d.department_id;
-- right join
Select e.e_name,
    d.d_name,
    e.salary
from Employees e
    right join Departments d on e.department_id = d.department_id;
-- full outer join
Select e.e_name,
    d.d_name,
    e.salary
from Employees e
    full outer join Departments d on e.department_id = d.department_id;
--  sub query 
SELECT *
FROM Employees
where emp_dept =(
        select dept
        from departments
        where d_name = 'Sales'
    );

