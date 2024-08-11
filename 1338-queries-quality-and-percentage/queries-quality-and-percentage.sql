# Write your MySQL query statement below
Select query_name,
Round(Avg(rating/position),2) AS quality,
Round(Sum(Case When rating < 3 then 1 else 0 END)/ Count(*)*100,2)AS poor_query_percentage
From queries 
Where query_name is not null
Group BY query_name;