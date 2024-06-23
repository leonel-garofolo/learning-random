# Fundamentals
Why is important to use MQTT to IoT architecture. Explanation:
* [What means IoT](https://www.paessler.com/es/it-explained/iiot)
* [Concepts](https://www.hivemq.com/article/iot-event-driven-microservices-architecture-mqtt/).
* [MQTT protocol](https://www.paessler.com/es/it-explained/mqtt)



# Direct method
Is the way to comunicate from device to cloud, it can be to topic specific of MQTT ($iothub/methods/POST/{method name}/)
or AMQP (application properties IoThub-methodname and IoThub-status).
Direct method are synchronous (default value to timeout is 30 seconds).

The direct method from cloud send message by HTTP protocol, on the other hand, 
use MQTT, AMQP, MQTT over WebSockets o AMQP over WebSockets from device to cloud.



