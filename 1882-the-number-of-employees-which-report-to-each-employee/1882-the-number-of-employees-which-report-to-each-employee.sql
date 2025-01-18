# Write your MySQL query statement below
SELECT t1.employee_id, t1.name, COUNT(t2.reports_to) as reports_count, ROUND(AVG(t2.age)) as average_age
FROM Employees t1, Employees t2
WHERE t1.employee_id = t2.reports_to
--  IN (SELECT reports_to FROM Employees)
GROUP BY 
-- t1.employee_id
t2.reports_to
ORDER BY t1.employee_id