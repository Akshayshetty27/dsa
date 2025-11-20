--  union all sql 
SELECT ...
FROM table1
UNION [ALL]
SELECT ...
FROM table2;


--  example  for union all 

SELECT city FROM customers
UNION ALL
SELECT city FROM suppliers;


--  Grouping sets in sQL 

-- Syntax
SELECT column1, column2, aggregate_function
FROM table
GROUP BY GROUPING SETS (
    (column1, column2),
    (column1),
    (column2),
    ()
);
 
--  example 
SELECT product, region, SUM(amount)
FROM sales
GROUP BY GROUPING SETS (
    (product, region),
    (product),
    (region),
    ()
);
