SELECT c.name,o.id FROM customers c
INNER JOIN orders o ON c.id = o.id_customers
WHERE EXTRACT(year FROM o.orders_date) = 2016
AND EXTRACT(month FROM o.orders_date) <= 6