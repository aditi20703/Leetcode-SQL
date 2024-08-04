# Write your MySQL query statement below
Select * 
from Cinema
Where
 MOD(id,2)=1
 And description != "boring"
 Order By rating DESC;