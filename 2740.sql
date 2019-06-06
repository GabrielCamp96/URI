SELECT concat('Podium: ',team) as name from league where position <=3
union all
SELECT concat('Demoted: ',team) as name from league where position >=14;