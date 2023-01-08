SELECT 
    CATEGORY, COUNT(CATEGORY) PRODUCTS
FROM (
    SELECT
        SUBSTR(PRODUCT_CODE, 1, 2) CATEGORY
    FROM
        PRODUCT
)
GROUP BY
    CATEGORY
ORDER BY
    CATEGORY;