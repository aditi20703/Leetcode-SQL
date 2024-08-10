# Write your MySQL query statement below
select contest_id ,round((count(reg.user_id)/(select count(*)from Users))*100,2) as percentage
from Users as u join Register as 
reg on
 u.user_id=reg.user_id  group by contest_id 
 order by  percentage desc , contest_id asc; 