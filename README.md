Payment Gateway Integration (Spring Boot)

This project is a small backend service where I tried to understand how real-world payment systems work.
I integrated Razorpay with a Spring Boot application and built an API to create payment orders.

The goal was to go beyond basic CRUD projects and explore how external services are used in backend development.

---

What this project does

- Creates a payment order using Razorpay
- Exposes a REST API to trigger payments
- Keeps the structure simple and easy to understand

Right now, it focuses only on the backend part of the payment flow.

---

Tech used

- Java 17
- Spring Boot
- Razorpay Java SDK
- Maven

---

How to run this project

Clone the repository:

git clone https://github.com/yourusername/payment-gateway-integration.git
cd payment-gateway-integration

Run the application:

mvn spring-boot:run

The server will start on:
http://localhost:8080

---

API

Create a payment order:

POST /api/payment/create-order?amount=500

This will return an order response from Razorpay which can be used on the frontend side.

---

Configuration

Before running, update your Razorpay credentials in:

src/main/resources/application.properties

razorpay.key=your_key_id
razorpay.secret=your_secret

---

Notes

- This project only handles order creation from the backend
- It does not include frontend checkout integration
- Keys are kept in properties file for simplicity (not production practice)

---

Why I built this

Most beginner projects don’t show how external services are integrated.
I built this to get hands-on experience with:

- third-party APIs
- payment workflows
- structuring a small but realistic backend service

---

What I would improve next

- Add payment verification (signature validation)
- Store transaction details in a database
- Add Swagger for testing APIs
- Separate this into a dedicated microservice

---

If you’re checking this project, feedback is welcome 🙂
