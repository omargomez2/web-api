# web-api

Distributed REST API client using Jakarta EE 10 and Remote EJB communication.

## Technologies

- Java 17
- Jakarta EE 10
- WildFly 40
- JAX-RS
- Remote EJB
- HTML/CSS/JavaScript
- Maven

---

## Architecture

Browser
   ->
REST API (web-api)
   ->
Remote EJB Invocation
   ->
EJB Server (ejb-server)

---

## Requirements

- Java 17
- WildFly 40
- Maven
- ejb-server deployed first

---

## Deployment

Build project:

```bash
mvn clean package
```

Deploy:

```text
web-api.war
```

to WildFly 40.

---

## IMPORTANT

The `ejb-server` project must be deployed before deploying `web-api`.

---

## Frontend Application

Default frontend page:

```text
http://localhost:8080/web-api/
```

---

## REST API Endpoint

Temperature conversion endpoint:

```text
http://localhost:8080/web-api/api/temperature/convert?c=25
```

Example JSON response:

```json
{
  "celsius": 25.0,
  "fahrenheit": 77.0,
  "status": "success"
}
```

---

## Features

- Remote EJB invocation
- REST API communication
- JSON responses
- Distributed enterprise architecture
- HTML/CSS/JavaScript frontend

---

## Educational Purpose

This project demonstrates:

- Distributed systems development
- Remote enterprise communication
- REST APIs with Jakarta EE
- Stateless EJBs
- JNDI lookup
- Layered enterprise architecture
- WildFly deployment

---

## Author

Omar G2
