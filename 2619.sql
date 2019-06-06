SELECT pd.name,pv.name,pd.price FROM products pd
INNER JOIN providers pv ON pd.id_providers = pv.id
INNER JOIN categories cat ON pd.id_categories = cat.id
WHERE cat.name LIKE 'Super Luxury'
AND pd.price > 1000