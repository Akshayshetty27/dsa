--  join    operation  in the  SQL 
-- let us consider we have  two tables  orders  and  customers
CREATE TABLE customers (
    customer_id INT PRIMARY KEY,
    customer_name VARCHAR(100),
    contact_email VARCHAR(100)
);
CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    order_date DATE,
    customer_id INT,
    amount DECIMAL(10, 2),
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);

--  inserting sample  input for the table  to perform  Join operation
 
 INSERT into customers (customer_id, customer_name, contact_email) VALUES
 (1, 'Alice ','alice@gmail.com'),
 (2, 'Bob ','bobthehunter@gmail.com'),
 (3, 'Don the jhon','jhonthedon@gmail.com');

 INSERT into orders (order_id, order_date, customer_id, amount) VALUES
 (101, '2023-01-15', 1, 250.00),
 (102, '2023-01-16', 2, 450.00),
 (103, '2023-01-17', 1, 150.00);


-- doing join operaton
-- 1 . inner join
SELECT o.order_id,
    o.order_date,
    c.customer_name,
    o.amount
FROM orders o
    INNER JOIN customers c ON c.customer_id = o.customer_id;
--  sample out put for inner join operation 


-- 2 . left join
SELECT o.order_id,
    o.order_date,
    c.customer_name,
    o.amount
FROM orders o
    LEFT JOIN customers c ON c.customer_id = o.customer_id;


--3. right join 
SELECT o.order_id as customer ,
o.order_date as  date , 
c.customer_name  as name,
 o.amount  AS amount
  from orders o  right JOIN customer c on c.customer_id = o.customer_id;


