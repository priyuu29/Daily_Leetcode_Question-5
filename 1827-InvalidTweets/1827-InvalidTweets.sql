-- Last updated: 8/13/2025, 10:24:05 AM
# Write your MySQL query statement below
select tweet_id 
from Tweets 
where length(content) > 15;