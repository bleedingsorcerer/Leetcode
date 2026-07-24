# Write your MySQL query statement below
(SELECT name AS results
FROM MovieRating m
JOIN Users u
ON m.user_id = u.user_id
GROUP BY u.user_id
ORDER BY COUNT(*) DESC, name
LIMIT 1)

UNION ALL

(SELECT title as results
FROM MovieRating m1
JOIN Movies m2
ON m1.movie_id = m2.movie_id
WHERE m1.created_at BETWEEN '2020-02-01' AND '2020-02-29'
GROUP BY title
ORDER BY AVG(m1.rating) DESC, m2.title
LIMIT 1);

