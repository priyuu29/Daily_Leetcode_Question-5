-- Last updated: 8/13/2025, 10:24:02 AM
# Write your MySQL query statement below
select distinct user_id,count(user_id) as followers_count from followers group by user_id order by user_id;