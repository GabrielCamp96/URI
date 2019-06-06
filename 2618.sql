SELECT pd.name,pv.name,cat.name FROM products pd
INNER JOIN providers pv ON pv.id = pd.id_providers
INNER JOIN categories cat ON cat.id = pd.id_categories
WHERE pv.name LIKE 'Sansul%'
AND cat.name LIKE 'Imported'