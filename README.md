# This project 
This project is to help with my understanding of sql injection and how to prevent it.


## SQL Injection 
select * from users where LastName='' or '' = '' and Password= '' or '' = ''
select * from users where LastName='tom' or '1'='1' and Password= 'tom' or '1'='1'
' or '' = ''
tom' or '1'='1 tom' or '1'='1
This injection would return 1, showing that it would return the first entry in the database

