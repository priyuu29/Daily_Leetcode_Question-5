-- Last updated: 8/13/2025, 10:24:50 AM
# Write your MySQL query statement below
select distinct 
author_id as id from views where author_id=viewer_id order by author_id;