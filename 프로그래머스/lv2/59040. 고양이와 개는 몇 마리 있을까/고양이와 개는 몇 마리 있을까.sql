SELECT
    ANIMAL_TYPE, COUNT(ANIMAL_ID) COUNT
FROM
    ANIMAL_INS 
WHERE
    ANIMAL_TYPE IN ('Cat', 'Dog')
GROUP BY
    ANIMAL_TYPE
ORDER BY
    (CASE WHEN ANIMAL_TYPE = 'Cat' THEN 1 ELSE 2 END);