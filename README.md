# 🏥 Patient Discharge Event-Driven System

An event-driven hospital workflow system built with **Spring Boot** demonstrating asynchronous domain events, decoupled services, and scalable backend architecture.

This project simulates how multiple independent hospital services react automatically when a patient is discharged.

---

## 🚀 Features

* Patient discharge workflow
* Event publishing using Spring Application Events
* Asynchronous event listeners (parallel execution)
* Decoupled service architecture
* REST API integration
* Swagger/OpenAPI documentation
* Clean layered architecture

---

## 🏗️ Architecture Overview

When a patient is discharged:

1. The system publishes a **PatientDischargeEvent**
2. Multiple services react independently:

   * Billing Service
   * Medical Records Service
   * Housekeeping Service
   * Notification Service
3. All handlers execute asynchronously without blocking the main request thread.

```
Controller → Service → Event Publisher → Async Handlers
```

This architecture improves:

* Performance
* Scalability
* Maintainability
* Separation of concerns

---

## 🧠 Technologies Used

* Java 17
* Spring Boot 3
* Spring Events
* Spring Async
* Lombok
* Maven
* Springdoc OpenAPI (Swagger)

---

## 📂 Project Structure

```
src/main/java/com/vinz/event_driven_architecture
│
├── controller   → REST Controllers
├── dto          → Request objects
├── event        → Domain events
├── handler      → Event listeners (services)
└── service      → Business logic & event publishing
```

---

## ▶️ Running the Application

### 1️⃣ Clone the repository

```bash
git clone https://github.com/richardvynz/patient-discharge-event-driven-system.git
cd patient-discharge-event-driven-system
```

### 2️⃣ Build the project

```bash
mvn clean install
```

### 3️⃣ Run the application

```bash
mvn spring-boot:run
```

Application starts on:

```
http://localhost:8080
```

---

## 📘 API Documentation (Swagger)

After starting the application:

```
http://localhost:8080/swagger-ui/index.html
```

---

## ⚡ Example Workflow

Discharging a patient triggers:

* Billing processing
* Medical record updates
* Room preparation
* Notification sending

All operations run concurrently using async event listeners.

---

## 🔥 Learning Objectives

This project demonstrates:

* Event-driven design principles
* Asynchronous processing in Spring Boot
* Loose coupling between services
* Real-world domain modeling
* Scalable backend architecture patterns

---

## ⚠️ Important Notes

This implementation uses **in-memory Spring events**.

In production systems, external brokers like:

* Apache Kafka
* RabbitMQ
* AWS SNS/SQS

would typically be used for reliability and persistence.

---

## 🚀 Future Improvements

* Kafka or RabbitMQ integration
* Retry and dead-letter queues
* Transactional events
* Distributed tracing
* Custom async thread pool
* Monitoring & observability

---

## 👨‍💻 Author

Vincent

---

## ⭐ If You Found This Useful

Give the project a star ⭐ on GitHub.
