-- Last updated: 8/13/2025, 10:24:31 AM
# Write your MySQL query statement below
select EmployeeUNI.unique_id,Employees.name from Employees left join EmployeeUNI on Employees.id=EmployeeUNI.id;