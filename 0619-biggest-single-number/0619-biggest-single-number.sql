# Write your MySQL query statement below
SELECT MAX(num) as num 
from MyNumbers 
WHERE num IN (SElECT num
FROM MyNumbers
GROUP BY num
HAVING count(num) = 1);