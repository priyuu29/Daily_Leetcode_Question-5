-- Last updated: 8/13/2025, 10:25:22 AM
# Write your MySQL query statement below
select
    name,population,area
from
    World
where    population>=25000000 or area>=3000000;