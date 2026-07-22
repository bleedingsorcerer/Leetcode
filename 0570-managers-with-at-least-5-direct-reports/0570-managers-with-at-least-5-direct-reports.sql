# Write your MySQL query statement below
SELECT m.name
FROM Employee e
JOIN Employee m
on e.managerID = m.id
GROUP BY m.id
HAVING COUNT(e.id) >= 5;