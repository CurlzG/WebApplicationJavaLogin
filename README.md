# This project 
This project is to help with my understanding of sql injection and how to prevent it.


## SQL Injection 
select * from users where LastName='' or '' = '' and Password= '' or '' = ''
select * from users where LastName='tom' or '1'='1' and Password= 'tom' or '1'='1'
' or '' = ''
tom' or '1'='1 tom' or '1'='1
This injection would return 1, showing that it would return the first entry in the database

### Updating mySQL
```
		String query = "select * from users where LastName='"+LastName+ "' and Password= '" + Password + "'";
		myRes = myStmt.executeQuery(query);
```
<br> too

```
	String query = "select * from users where LastName='?' and Password= '?'";
		PreparedStatement p = myConn.prepareStatement(query);
		p.setString(1,LastName);
		p.setString(2,Password);
		myRes = p.executeQuery();
```

## Updating SQL Injection
Going from ' or '' = ''
select * from users where LastName='' or '' = '' and Password= '' or '' = '' to
select * from users where LastName = 'or \'\' = \'\'' and Password = 'or \'\' = \'\''
This helps break the sql by not allowing any extra ' be allowed in query 