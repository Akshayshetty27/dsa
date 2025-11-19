-- Window Function Example : 
SELECT order_id,
    amount,
    SUM(amount) OVER (
        ORDER BY order_id
    ) AS running_total
FROM orders;


SELECT emp_id,
    salary,
    ROW_NUMBER() OVER (
        ORDER BY salary DESC
    ) AS rn
FROM employees;

-- rank
SELECT emp_id,
    salary,
    RANK() OVER (
        ORDER BY salary DESC
    ) AS rnk;

-- lag 
SELECT 
    month,
    sales,
    LAG(sales, 1) OVER (ORDER BY month) AS prev_month,
    sales - LAG(sales, 1) OVER (ORDER BY month) AS diff
FROM monthly_sales;

