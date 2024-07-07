# BluePrint to case of Distribution Lock application
We try to represent the case when app is run in multiple instance in the same cluster. 
The solution is use Redis to manager data cache in multiple instance. 

## References
 - [Distributed lock with Redis and Spring Boot](https://medium.com/@egorponomarev/distributed-lock-with-redis-and-spring-boot-2c3f51a44c65)
 - [Redis distributed lock](https://redis.io/docs/latest/develop/use/patterns/distributed-locks/)
 - [Spring Data Audit](https://medium.com/programmingmitra-com/spring-data-jpa-auditing-saving-createdby-createddate-lastmodifiedby-lastmodifieddate-c2d64c42998e)

# API Rest endpoint request

Health prove that application is up.
```
curl -H 'Content-Type: application/json' http://localhost:8080/demo-spring-redis
```

Get All client
```
curl -H 'Content-Type: application/json' http://localhost:8080/demo-spring-redis/client
```

Create new client
```
curl -X POST -H 'Content-Type: application/json' -H "Accept: application/json" -d '{"name":"Leonel", "yearOld", 39}' http://localhost:8080/demo-spring-redis/client 
```

Update a client
```
curl -X POST -H 'Content-Type: application/json' -H "Accept: application/json" -d '{"id":"668291108a287f710ecaf427", "name":"Leonel", "yearOld": 39}' http://localhost:8080/demo-spring-redis/client 
```

Delete a client
```
curl -X DELETE -H 'Content-Type: application/json' http://localhost:8080/demo-spring-redis/client/668290746879e305973a7d18
```
