# Databases non-Relational SQL

## Patters
The solutions with databases non relational is very important define a good model because is very hard fix performance issues  

![alt text](./img/NonRelationalDatabasesPatterns.png)


## Best Practices
1. Imbibe is better than object link unless there is best reason to do. 
2. In relationship one to many where many is too long, pleanse NO imbibe it.
3. Try to avoid $lookups if it is possible, but don't worry if you should propose a better schema design.
4. Arrays can't grow up without limit (it is related with point 2).
5. The database model completely depends on the application access patterns.   


## MongoDB
Considerations:
- Data Duplication is not a problem to DB, only de application have to consider when update a data in a document also have to update in others document 
- 


