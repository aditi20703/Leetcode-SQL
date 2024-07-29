# Write your MySQL query statement below
select distinct author_id as id from Views
 where viewer_id=author_id  Order BY id;
