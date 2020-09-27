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
 
 
 
 
 
    
    
    
