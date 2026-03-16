# 🧾 Spring Boot Billing System

A simple **Billing Management System** built using **Spring Boot, Thymeleaf, and MySQL**.
This project allows users to manage products, generate bills, and view billing history through a clean web interface.

---

## 🚀 Features

* 📦 **Product Management**

  * Add new products
  * View product list
  * Manage product details

* 🧾 **Billing System**

  * Generate bills for selected products
  * Automatic total calculation

* 📊 **Billing History**

  * View previously generated bills
  * Display bill ID, total amount, and billing date

* 🎨 **User Interface**

  * Clean UI using HTML, CSS, and Thymeleaf
  * Navigation bar for easy access

---

## 🛠️ Technologies Used

* **Backend**

  * Spring Boot
  * Spring Data JPA

* **Frontend**

  * HTML
  * CSS
  * Thymeleaf

* **Database**

  * MySQL

* **Build Tool**

  * Maven

---

## 📂 Project Structure

```
billing-system
│
├── src/main/java
│   ├── controller
│   ├── model
│   ├── repository
│
├── src/main/resources
│   ├── templates
│   │   ├── billing.html
│   │   ├── products.html
│   │   └── bill-history.html
│   └── application.properties
│
├── pom.xml
└── README.md
```

---

## ⚙️ Setup and Installation

### 1. Navigate to the project folder

```
cd billing-system
```

### 2. Configure MySQL Database

Update the database settings in **application.properties**

```
spring.datasource.url=jdbc:mysql://localhost:3306/billing_system
spring.datasource.username=root
spring.datasource.password=yourpassword
```

---

### 3. Run the application

```
mvn spring-boot:run
```

---

### 4. Open in browser

```
http://localhost:8080
```

---

## 📸 Screens

* Billing Page
* Product Management
* Bill History

---

## 📌 Future Improvements

* User authentication
* Dashboard analytics

---


