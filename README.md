<h1 align="center">Spring Micro Bookstore 📚</h1>

This application is primarily intended for exploring technical concepts. My goal is to experiment with different technologies, software architecture designs, and all the essential components involved in building a microservices-based application.

## Features :sparkles:

- ✅ Using `Event-Driven Architecture` built on top of RabbitMQ and Kafka for asynchronous communication between services
- ✅ Building RESTful APIs using `Spring Boot`, with integrated `Swagger/OpenAPI` for interactive documentation
- ✅ Leveraging `gRPC` for efficient internal service-to-service communication
- ✅ Implementing the `API Gateway` pattern to handle routing
- ✅ Applying the `Outbox Pattern` to ensure reliable and consistent event publishing
- ✅ Managing distributed task execution with ShedLock to prevent duplicate processing via `Distributed Locking`
- ✅ Ensuring system resilience using `Resilience4j`, with support for circuit breakers, retries, rate limiting, and timeout handling
- ✅ Utilizing `PostgreSQL` for persistent storage, `Flyway` for version-controlled database migrations, and `JPA/Hibernate` for ORM
- ✅ Testing with `JUnit 5`; supporting tools include `TestContainers` for integration tests, `REST Assured` for API testing, `WireMock` for mocking external dependencies, and `Instancio` for generating test data
- ✅ Observability with `Spring Boot Actuator` endpoints, `Prometheus` for metrics collection, `Grafana` for visualization, `OpenTelemetry` for distributed tracing, `Tempo` for trace storage, and `Loki` for log aggregation
- ✅ Containerizing and orchestrating services using Docker and `docker-compose` for streamlined local deployment and development
- 🚧 Add `Kubernetes` for container orchestration and deployment

## Technologies - Libraries 🛠️

### Core Framework

- **[Spring Boot](https://spring.io/projects/spring-boot)** - Framework for building web applications
- **[Spring Data JPA](https://spring.io/projects/spring-data-jpa)** - Data access layer
- **[Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html)** - Production-ready features
- **[Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/current/reference/html/using.html#using.devtools)** - Development tools
- **[Maven](https://maven.apache.org/)** - Build automation and dependency management tool
- **[gRPC](https://grpc.io/)** - High-performance RPC framework

### Database & Migration

- **[PostgreSQL](https://www.postgresql.org/)** - Advanced open-source database
- **[Flyway](https://flywaydb.org/)** - Database migration tool
- **[Spring Data JPA](https://spring.io/projects/spring-data-jpa)** - Data access layer
- **[Hibernate](https://hibernate.org/)** - Object-relational mapping framework

### API Documentation

- **[SpringDoc OpenAPI](https://springdoc.org/)** - API documentation with OpenAPI 3
- **[Swagger UI](https://swagger.io/tools/swagger-ui/)** - Interactive API documentation

### Resilience & Stability

- **[Resilience4j](https://resilience4j.readme.io/)** - Fault tolerance library
- **[ShedLock](https://github.com/lukas-krecan/ShedLock)** - Distributed lock implementation

### Testing

- **[JUnit 5](https://junit.org/junit5/)** - Unit testing framework
- **[TestContainers](https://www.testcontainers.org/)** - Integration testing with containers
- **[REST Assured](https://rest-assured.io/)** - REST API testing
- **[Spring Boot Test](https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.testing)** - Spring Boot testing support
- **[WireMock](https://wiremock.org/)** - API mocking
- **[Instancio](https://www.instancio.org/)** - Test data generation

### Observability

- **[Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html)** - Production-ready features
- **[Micrometer](https://micrometer.io/)** - Application metrics facade
- **[Prometheus](https://prometheus.io/)** - Metrics collection and storage
- **[Grafana](https://grafana.com/)** - Metrics visualization and dashboards
- **[OpenTelemetry](https://opentelemetry.io/)** - Observability framework
- **[Tempo](https://grafana.com/oss/tempo/)** - Distributed tracing backend (Grafana's tracing solution)
- **[Loki](https://grafana.com/oss/loki/)** - Log aggregation system

### Build & Development

- **[Maven](https://maven.apache.org/)** - Build automation tool
- **[Spotless](https://github.com/diffplug/spotless)** - Code formatting
- **[Git Commit ID Maven Plugin](https://github.com/git-commit-id/git-commit-id-maven-plugin)** - Git information in builds

## System Architecture 🏗️

<summary><strong>System Architecture Overview</strong></summary>
<img src="docs/spring-micro-bookstore-architecture.png" width="600"/>

<details>
  <summary><strong>Package by Components</strong></summary>
  <img src="docs/package-by-components.png" width="600"/>
</details>

<details>
  <summary><strong>RabbitMQ Architecture</strong></summary>
  <img src="docs/rabbitmq-architecture.png" width="600"/>
</details>

<details>
  <summary><strong>Resilience Patterns</strong></summary>
  <img src="docs/resilience-patterns.png" width="600"/>
</details>

<details>
  <summary><strong>Outbox Pattern</strong></summary>
  <img src="docs/outbox-pattern.png" width="600"/>
</details>

<details>
  <summary><strong>API Gateway</strong></summary>
  <img src="docs/api-gateway.png" width="600"/>
</details>
