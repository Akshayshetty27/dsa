SELECT
    month,
    sales,
    AVG(sales) OVER (
        ORDER BY month
        ROWS BETWEEN 2 PRECEDING AND CURRENT ROW
    ) AS moving_avg_3
FROM monthly_sales;


select name ,
    amount ,
    FIRST_VALUE( amount) over (PARTITION BY
        name
        ORDER BY amount DESC) as first_value_per_name 
from sales_data;

select name, 
amount ,
last_value(amount) over (PARTITION BY
    name
    ORDER BY amount DESC
    ROWS BETWEEN UNBOUNDED PRECEDING AND UNBOUNDED FOLLOWING) as last_value_per_name   
from sales_data;