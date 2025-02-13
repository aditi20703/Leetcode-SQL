# Write your MySQL query statement below
#SELECT max(salary) as SecondHighestSalary from Employee
#group by salary
#limit 1,1;
SELECT MAX(salary) AS SecondHighestSalary
FROM Employee
WHERE salary < (SELECT MAX(salary) FROM Employee);