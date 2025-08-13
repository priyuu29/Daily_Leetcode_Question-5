-- Last updated: 8/13/2025, 10:24:54 AM
# Write your MySQL query statement below
select Product.product_name,Sales.year,Sales.price from Sales join Product on Product.product_id=Sales.product_id;