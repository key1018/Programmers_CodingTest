select to_char(sales_date, 'YYYY-MM-DD') sales_date, product_id, user_id, sales_amount
from (select sales_date, product_id, user_id, sales_amount
     from online_sale
     where to_char(sales_date, 'YYYYMM') = '202203'
     union
     select sales_date, product_id, null, sales_amount
     from offline_sale
     where to_char(sales_date, 'YYYYMM') = '202203')
order by sales_date, product_id, user_id