SELECT 
    YEAR, MONTH, PUCHASED_USERS,
    ROUND(
        PUCHASED_USERS / 
        (SELECT COUNT(USER_ID)
         FROM USER_INFO
         WHERE TO_CHAR(JOINED, 'YYYY') = '2021'), 1  
    ) PUCHASED_RATIO
FROM(
    SELECT
        TO_CHAR(S.SALES_DATE, 'YYYY') YEAR, 
        TO_CHAR(S.SALES_DATE, 'MM') MONTH,
        COUNT(DISTINCT S.USER_ID) PUCHASED_USERS
    FROM
        ONLINE_SALE S
    JOIN
        USER_INFO U ON S.USER_ID = U.USER_ID
    WHERE 
        TO_CHAR(U.JOINED, 'YYYY') = '2021'
    GROUP BY 
        TO_CHAR(S.SALES_DATE, 'YYYY'), 
        TO_CHAR(S.SALES_DATE, 'MM') 
    ORDER BY 
        TO_CHAR(S.SALES_DATE, 'YYYY'), 
        TO_CHAR(S.SALES_DATE, 'MM')
);