-- Last updated: 8/13/2025, 10:26:24 AM
# Write your MySQL query statement below
select b.id as Id from weather a ,weather b where datediff(b.recordDate,a.recordDate)=1 and a.temperature<b.temperature;