# notification-order-microservice-system

This project is a demo to understand event-driven architecture in microservices using Spring Boot, Spring Cloud Stream, and RabbitMQ.

## Microservices in this Project

- **order-service**: Handles order creation and emits events.
- **notification-service**: Listens for order events and sends notifications.
- **discovery-service**: Service registry using Eureka.

## Running RabbitMQ Locally

You can run RabbitMQ using Docker (with or without Docker Desktop). If you don't want Docker Desktop, you can use [Colima](https://github.com/abiosoft/colima) as a lightweight Docker runtime for macOS.

### Start Colima (if not using Docker Desktop)
```sh
brew install colima
colima start
```

### Run RabbitMQ with Docker
```sh
docker run -d --hostname rabbitmq --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3-management
```
- Management UI: http://localhost:15672 (user: guest, pass: guest)
- AMQP port: 5672

## Reliability Notes
- **Messages are not lost** if your consumer service is down, as long as:
  - The queue is **durable**
  - Messages are **persistent**
- **DLQ (Dead Letter Queue)** is recommended for handling messages that cannot be processed after several attempts, but is not required for temporary consumer downtime.
- Monitor queue size and disk space if your service may be down for an extended period.

## Developer Usage
1. Start RabbitMQ as above.
2. Start each microservice (order, notification, discovery) using Maven or your IDE.
3. Place your RabbitMQ connection settings in `application.properties`:
   ```properties
   spring.rabbitmq.host=localhost
   spring.rabbitmq.port=5672
   spring.rabbitmq.username=guest
   spring.rabbitmq.password=guest
   ```
4. Create an order via the order-service API to see event-driven flow.

## Useful Commands
- Check what is using a port:
  ```sh
  lsof -i :5672
  ```
- View running Docker containers:
  ```sh
  docker ps
  ```

## License
MIT
