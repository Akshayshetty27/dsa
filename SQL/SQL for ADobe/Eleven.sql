-- 5. Get the highest-rated movie per genre.
-- Tables: movies(movie_id, genre, rating)

select m1.movie_id, m1.genre, m1.rating
from movies m1
where m1.rating= (select max(m2.rating) from movies m2 where m2.genre = m1.genre);


-- 6.Find duplicated email addresses in the users table.
-- Tables: users(user_id, email)

select email , count(*) as email_count
from users  group by email
having count(*) > 1;


-- 7. Detect products with the exact same (name, price).
select name,price , count(*) as product_count
from products
group by name, price
having count(*) > 1;


-- 8. Find employees with the same first and last name.
select first_name , last_name , count(*) profile_count
from users  GROUP BY first_name, last_name
HAVING count(*) > 1;



