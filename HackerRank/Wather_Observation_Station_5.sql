(SELECT CITY, CHARACTER_LENGTH(CITY) AS LEN  FROM STATION ORDER BY LEN DESC LIMIT 1)
UNION
(SELECT CITY,CHARACTER_LENGTH(CITY) AS LEN FROM STATION ORDER BY LEN ASC,CITY ASC LIMIT 1 );