SELECT movies.id,movies.name FROM movies
INNER JOIN genres ON movies.id_genres = genres.id
INNER JOIN movies_actors ON movies.id = movies_actors.id_movies
INNER JOIN actors ON movies_actors.id_actors = actors.id
WHERE genres.description LIKE 'Action'
AND actors.name LIKE '% Silva'