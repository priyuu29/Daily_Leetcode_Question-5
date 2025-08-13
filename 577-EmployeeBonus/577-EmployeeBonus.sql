-- Last updated: 8/13/2025, 10:25:25 AM
# Write your MySQL query statement below
SELECT name,bonus
FROM Employee LEFT JOIN Bonus ON Employee.empId = Bonus.empId
WHERE bonus<1000 or bonus is Null