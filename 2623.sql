SELECT pd.name,cat.name FROM products pd
INNER JOIN categories cat ON pd.id_categories = cat.id
WHERE pd.amount > 100
AND pd.id_categories IN (1,2,3,6,9)