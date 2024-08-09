# Write your MySQL query statement below
Select  user_id,
CONCAT (
    Upper(Substring(name,1,1)),
    Lower(Substring(name,2,Length(name))) 
    )AS name
    from Users
    Order by user_id;
