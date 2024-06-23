# Even Driven Kafka
## Kafka Setup
Following this [guide](https://www.baeldung.com/ops/kafka-docker-setup) to setup a docker with Kafka and Zookeeper

## Working in kafka docker
With this command we can into docker container
```
docker exec -it <container_name> bash
```
The Kafka scripts are in <b>/bin</b> folder

Basically, we need the following things to communicate in Kafka:
- A topic
- Producer events
- Consumer reception events

Create topic
```
kafka-topics.sh --create --topic <topic_name> --partitions 1 --replication-factor 1 --bootstrap-server kafka:9092
```
Create producer message:
```
kafka-console-producer.sh --topic <topic_name> --bootstrap-server kafka:9092
```
Create consume listener
```
kafka-console-consumer.sh --topic <topic_name> --from-beginning --bootstrap-server kafka:9092
```

## Data Transfer Object (DTO) with Apache Avro
- Create objects with [Apache Avro](https://avro.apache.org/docs/)  
- Install plugin Apache Avro IDL Schema


## IT
### User Case testing (Services Rest) 

Create account
```
curl -X POST -H "Content-Type: application/json" http://localhost:8080/account/create
```
