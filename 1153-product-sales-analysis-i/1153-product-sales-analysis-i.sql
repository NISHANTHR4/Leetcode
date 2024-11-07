# Write your MySQL query statement below
select product_name,year,price from sales as s,product as p
where s.product_id=p.product_id;