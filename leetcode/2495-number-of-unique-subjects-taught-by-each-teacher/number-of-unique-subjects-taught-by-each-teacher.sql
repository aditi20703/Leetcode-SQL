# Write your MySQL query statement below
Select teacher_id,Count(Distinct subject_id) as cnt
from Teacher
Group by teacher_id;