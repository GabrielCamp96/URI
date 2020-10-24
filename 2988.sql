select 
  t.name, 
  count(*) as matches,
  count(case when 
          ((t.id = m.team_1 and m.team_1_goals > m.team_2_goals) 
           or (t.id = m.team_2 and m.team_2_goals > m.team_1_goals)) then m.id end) as "victories",
  count(case when 
          ((t.id = m.team_1 and m.team_1_goals < m.team_2_goals) 
           or (t.id = m.team_2 and m.team_2_goals < m.team_1_goals)) then m.id end) as "defeats",
  count(case when 
          ((t.id = m.team_1 and m.team_1_goals = m.team_2_goals) 
           or (t.id = m.team_2 and m.team_2_goals = m.team_1_goals)) then m.id end) as "draws",
  ((count(case when 
          ((t.id = m.team_1 and m.team_1_goals > m.team_2_goals) 
           or (t.id = m.team_2 and m.team_2_goals > m.team_1_goals)) then m.id end) * 3) 
   + 
   count(case when 
          ((t.id = m.team_1 and m.team_1_goals = m.team_2_goals) 
           or (t.id = m.team_2 and m.team_2_goals = m.team_1_goals)) then m.id end)) as "score"
from teams t
inner join matches m on (t.id = m.team_1 or t.id = m.team_2)
group by t.name
order by "score" DESC;