-- Syntax 
WITH cte_name AS (
    SELECT ...
)
SELECT ...
FROM cte_name;

--  example 
WITH sales_summary AS (
    SELECT customer_id,
        SUM(amount) AS total_spent
    FROM sales
    GROUP BY customer_id
)
SELECT *
FROM sales_summary
WHERE total_spent > 1000;


-- recursive example syntax 
WITH RECURSIVE cte_name AS (
    SELECT ...
    UNION ALL
    SELECT ...
    FROM cte_name
    WHERE ...
)
SELECT * FROM cte_name;



--  Case Whrn in SQL 
-- Syntax

 CASE
    WHEN condition1 THEN result1
    WHEN condition2 THEN result2
    ELSE default_result
END

--  example
SELECT customer_id, amount,
    CASE
        WHEN amount >= 1000 THEN 'High'
        WHEN amount >= 500 THEN 'Medium'
        ELSE 'Low'
    END AS spending_level
FROM sales;

