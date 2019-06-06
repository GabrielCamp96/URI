select substr(np.cpf, 1, 3) || '.' ||
       substr(np.cpf, 4, 3) || '.' ||
       substr(np.cpf, 7, 3) || '-' ||
       substr(np.cpf, 10) from natural_person np inner join customers c on c.id = np.id_customers; 