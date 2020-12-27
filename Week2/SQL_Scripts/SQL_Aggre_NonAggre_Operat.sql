/*Using Select Statement*/
select * from player;
select * from teamgroups;
select * from manager m;
select * from player_state;
select * from position; 

/*Using Select Statement with join(left, right, full) and join(left outer, right outer, full outer)*/
select p.player_id, p.player_name, t.team_id, t.team_name 
from player p 
join  teamgroups t 
on p.team_id = t.team_id; 

select p.player_id, p.player_name, t.team_id, t.team_name 
from player p 
left join  teamgroups t 
on p.team_id = t.team_id; 

select p.player_id, p.player_name, t.team_id, t.team_name 
from player p 
right join  teamgroups t 
on p.team_id = t.team_id; 

select p.player_id, p.player_name, t.team_id, t.team_name 
from player p 
full join  teamgroups t 
on p.team_id = t.team_id; 

select p.player_id, p.player_name, t.team_id, t.team_name 
from player p 
left outer join  teamgroups t 
on p.team_id = t.team_id; 

select p.player_id, p.player_name, t.team_id, t.team_name 
from player p 
right outer join  teamgroups t 
on p.team_id = t.team_id; 

select p.player_id, p.player_name, t.team_id, t.team_name 
from player p 
full outer join  teamgroups t 
on p.team_id = t.team_id; 

select p.player_id, p.player_name, t.team_id, t.team_name 
from player p 
cross join teamgroups t 


/*Using the where statement and the group by/order by statement*/
select *
from teamgroups t2 
where t2.team_id = 100; 

select *
from player p2 
where p2.player_id > 1; 

select *
from  teamgroups t2 
where  t2.team_id between 102 and 104;

select *
from  teamgroups t2 
where  t2.team_id between 102 and 104;

select *
from  teamgroups t2 
group by t2.team_id 
order by (team_id);


/*Using Aggregate functions (max, min, avg, sum, count)*/
select avg(team_touchdowns_for), avg(team_touchdown_against) as "avg"
from teamgroups t;

select max(team_touchdown_against), max(team_touchdowns_for) as "max"
from teamgroups t;

select min(team_touchdown_against), min(team_touchdowns_for) as "max"
from teamgroups t;

select count(player_id) 
from player p; 

select sum(team_touchdown_against), sum(team_touchdowns_for) as "sum"
from teamgroups t;


/*Using Non-Aggregate-Functions*/

/*String Functons (Upper, Lower, Reverse, left, right, character length, concat) */
select upper(player_name) as "UpperCase"
from player p;

select lower(player_name) as "LowerCase"
from player p;

select reverse(player_name) from player p;  

select left(manager_name,2) as "extractstring"
from "Manager" m ; 

select right(manager_name,2) as "extractstring"
from "Manager" m ;

select character_length(player_name) as "lengthofstring"
from player p;

select concat(player_name, team_name)
from player p, teamgroups t2;

/*Math-Functions */

select random()*10;

select power(player_id,2) from player p; 

select sqrt(t.team_touchdown_against) from teamgroups t; 

select log(team_touchdown_against) from teamgroups t;

/*Date-Functions */

select current_timestamp;

select current_time;

select date_part('hour', timestamp '2001-11-18 20:38:40');

select date_trunc('hour', timestamp '2018-02-16 20:43:30'); 

/*Set-Operations */

/*Set (union, union-allm intersect, except) */
select player_id from player p2 
union 
select team_touchdown_against from teamgroups t2;

select player_id from player p2 
union all
select manager_id from "Manager" m2;

select team_id from player p2
intersect
select team_id from teamgroups t2;

select player_id from player p 
except
select position_id from "Position" p2 ;

