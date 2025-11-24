-- practice real problems 
-- 1️Find the top 3 highest-paid employees .
-- Tables: employees(emp_id, name, salary, dept_id), departments(dept_id, dept_name)

 Select  e.emp_id, e.name, e.salary, d.dept_name
 from employees e join departments d on e.dept_id = d.dept_id  ORDER BY e.salary  desc LIMIT 3;



-- 2) Find the most expensive product in every product category.
-- Tables: products(product_id, price, category_id)

select p1.product_id, p1.price, p1.category_id
from products p1
where p1.price = (select max(p2.price) from products p2 where p2.category_id = p1.category_id);


-- For each city, return the 5 users with the newest signup dates.
-- Tables: users(user_id, city, signup_date)

SELECT u1.user_id, u1.city, u1.signup_date
FROM users u1
WHERE (
    SELECT COUNT(*)
    FROM users u2
    WHERE u2.city = u1.city AND u2.signup_date > u1.signup_date
) < 5;


-- For each customer, return their top 2 most expensive orders.
-- Tables: orders(order_id, customer_id, amount)

SELECT o.order_id, o.customer_id, o.amount
FROM orders o
WHERE (
    SELECT COUNT(*)
    FROM orders o2
    WHERE o2.customer_id = o.customer_id AND o2.amount > o.amount
) < 2;

