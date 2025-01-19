# Write your MySQL query statement below
SELECT a.firstName, a.lastName, b.city, b.state
FROM Person a
LEFT JOIN Address B
ON a.personId = b.personId