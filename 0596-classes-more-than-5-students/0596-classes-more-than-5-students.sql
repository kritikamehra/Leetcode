-- # Write your MySQL query statement below
-- SELECT class
-- FROM Courses
-- HAVING (COUNT(SELECT student FROM Courses GROUP BY(class)) >= 5)

# Write your MySQL query statement below
SELECT class
FROM Courses
GROUP BY class
HAVING (COUNT(student) >= 5)