SELECT * FROM CITY WHERE
    COUNTRYCODE = 'USA'
    AND POPULATION > 100000;
    
   -----------------------------------------------------------------------------------------------------------------
   SELECT NAME FROM CITY WHERE COUNTRYCODE = 'USA' AND POPULATION > 120000;
   --------------------------------------------------------------------------------------------------------------------
   SELECT *
FROM
    (SELECT CITY, LENGTH(CITY)
    FROM STATION
    ORDER BY LENGTH(CITY), CITY)
WHERE ROWNUM = 1
UNION
SELECT *
FROM
    (SELECT CITY, LENGTH(CITY)
    FROM STATION
    ORDER BY LENGTH(CITY) DESC, CITY)
WHERE ROWNUM = 1;
----------------------------------------------------------------------------------------------------------------------------

SELECT DISTINCT CITY
FROM STATION
WHERE REGEXP_LIKE(City, '^[^AEIOU]');
-----------------------------------------------------------------------------------------------------------------------------
SELECT DISTINCT CITY
FROM STATION
WHERE REGEXP_LIKE(City, '^[AEIOU].*[aeiou]$');
-----------------------------------------------------------------------------------------------------------------------------

SELECT DISTINCT CITY
FROM STATION
WHERE REGEXP_LIKE(City, '[aeiou]$');
------------------------------------------------------------------------------------------------------------------------------
SELECT  CASE
    WHEN A+B>C AND B+C>A AND A+C>B THEN
        CASE 
            WHEN A=B AND B=C THEN 'Equilateral'
            WHEN A=B or A=C OR B=C THEN 'Isosceles'
            ELSE 'Scalene'
        END
    ELSE 'Not A Triangle'
END
FROM TRIANGLES 
--------------------------------------------------------------------------------------------------------------------------------
SELECT Name || '(' || SUBSTR(Occupation,1,1) || ')'-- AS THETEXT, '1' AS SELECTNUMBER
    FROM OCCUPATIONS
    order by Name;

    SELECT 'There are a total of' || ' ' || COUNT(*) || ' ' || lower(Occupation) || 's.'
    FROM OCCUPATIONS  GROUP BY OCCUPATION                            
    ORDER BY COUNT(Occupation), lower(Occupation);
    -----------------------------------------------------------------------------------------------------------------------------------
 select doctor,professor,singer,actor from (select * from (select Name, occupation, (ROW_NUMBER() 
 OVER (PARTITION BY occupation ORDER BY name)) as row_num from occupations order by name asc)
 pivot ( min(name) for occupation in ('Doctor' as doctor,'Professor' as professor,'Singer' as singer,'Actor' as actor)) order by row_num);   
 --------------------------------------------------------------------------------------------------------------------------------------------
 SELECT c.Company_Code, c.founder, count(Distinct e.Lead_Manager_Code), 
count(distinct e.Senior_Manager_Code), count(distinct e.Manager_Code), 
count(distinct e.employee_Code) FROM Company c 
JOIN Employee e ON c.Company_Code = e.Company_Code GROUP BY c.Company_Code, c.Founder ORDER BY c.COMpany_Code;
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
 SELECT N, CASE
            WHEN P IS NULL THEN 'Root'
            WHEN (SELECT COUNT(*) FROM BST child WHERE child.P = father.N) > 0 THEN 'Inner'
            ELSE 'Leaf'
          END
FROM BST father
ORDER BY N;
 -------------------------------------------------------------------------------------------------------------------------------------------------------------
        select 
  contests.contest_id, 
  contests.hacker_id, 
  contests.name,
  sum(submissions_sums.sum_submissions),
  sum(submissions_sums.sum_accepted_submissions),
  sum(views_sums.sum_views),
  sum(views_sums.sum_unique_views)
from contests 
join colleges on contests.contest_id = colleges.contest_id
join challenges on colleges.college_id = challenges.college_id


left join 
(select 
  challenge_id,
  sum(total_submissions) as sum_submissions,
  sum(total_accepted_submissions) as sum_accepted_submissions
  from submission_stats group by challenge_id) 
as submissions_sums
on challenges.challenge_id = submissions_sums.challenge_id


left join
(select 
  challenge_id,
  sum(total_views) as sum_views,
  sum(total_unique_views) as sum_unique_views
  from view_stats group by challenge_id) 
as views_sums
on challenges.challenge_id = views_sums.challenge_id

group by contests.contest_id, contests.hacker_id, contests.name

having (
  sum(submissions_sums.sum_submissions) +
  sum(submissions_sums.sum_accepted_submissions) +
  sum(views_sums.sum_views) +
  sum(views_sums.sum_unique_views)
) > 0
order by contests.contest_id;
 -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 SELECT SUBMISSION_DATE,
(SELECT COUNT(DISTINCT HACKER_ID)  
 FROM SUBMISSIONS S2  
 WHERE S2.SUBMISSION_DATE = S1.SUBMISSION_DATE AND    
(SELECT COUNT(DISTINCT S3.SUBMISSION_DATE) 
 FROM SUBMISSIONS S3 WHERE S3.HACKER_ID = S2.HACKER_ID AND S3.SUBMISSION_DATE < S1.SUBMISSION_DATE) = DATEDIFF(S1.SUBMISSION_DATE , '2016-03-01')),
(SELECT HACKER_ID FROM SUBMISSIONS S2 WHERE S2.SUBMISSION_DATE = S1.SUBMISSION_DATE 
GROUP BY HACKER_ID ORDER BY COUNT(SUBMISSION_ID) DESC, HACKER_ID LIMIT 1) AS TMP,
(SELECT NAME FROM HACKERS WHERE HACKER_ID = TMP)
FROM
(SELECT DISTINCT SUBMISSION_DATE FROM SUBMISSIONS) S1
GROUP BY SUBMISSION_DATE;
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------- 
 
    
    
    
