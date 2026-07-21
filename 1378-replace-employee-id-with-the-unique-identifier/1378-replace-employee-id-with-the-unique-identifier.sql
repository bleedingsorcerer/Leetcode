# Write your MySQL query statement below
SELECT emp.unique_id, e.name
FROM Employees as e
LEFT JOIN EmployeeUNI as emp
ON e.id = emp.id;