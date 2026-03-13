# RevPay – Full Stack FinTech Platform

RevPay is a **full-stack FinTech web application** built using **Spring Boot and MySQL** that enables secure digital payments, wallet management, transaction processing, and financial operations for both personal and business users.

The platform supports **peer-to-peer payments, invoice management, loan management, fraud monitoring, and role-based authentication**.

---

## 🚀 Features

### User Features
- User Registration and Login
- Secure Authentication using Spring Security
- Wallet Management
- Peer-to-Peer Money Transfer
- Transaction History
- Money Request System
- Payment Methods Management

### Business Features
- Business Profile Management
- Invoice Generation
- Business Verification (KYC)
- Loan Application
- Loan Repayment Tracking
- Fraud Detection Monitoring

### System Features
- Notification System
- Transaction Export
- Admin Monitoring and Logs

---

## 🏗 System Architecture

The application follows a **Layered Architecture (MVC Pattern)**.

```
User (Browser)
      ↓
Controller Layer
      ↓
Service Layer
      ↓
Repository Layer
      ↓
Database (MySQL)
```

### Layers Description

**Controller Layer**
Handles HTTP requests and responses.

**Service Layer**
Contains business logic.

**Repository Layer**
Communicates with the database using Spring Data JPA.

**Entity Layer**
Represents database tables.

---

## 🛠 Technologies Used

### Backend
- Java
- Spring Boot
- Spring Security
- Spring Data JPA

### Database
- MySQL

### Frontend
- Thymeleaf
- HTML
- CSS

### Build Tool
- Maven

---

## 📂 Project Structure

```

revpay_web
│
├── src
│   └── main
│       └── java
│           └── com.revpay
│               ├── config
│               │   ├── PasswordConfig.java
│               │   ├── SecurityConfig.java
│               │   └── WebConfig.java
│               │
│               ├── controller
│               │   ├── AdminController.java
│               │   ├── AuthController.java
│               │   ├── BusinessController.java
│               │   ├── BusinessVerificationController.java
│               │   ├── HomeController.java
│               │   ├── InvoiceController.java
│               │   ├── LoanController.java
│               │   ├── LoanPaymentController.java
│               │   ├── LoginController.java
│               │   ├── MoneyRequestController.java
│               │   ├── NotificationController.java
│               │   ├── PaymentMethodController.java
│               │   ├── ProfileController.java
│               │   ├── TransactionController.java
│               │   ├── TransactionExportController.java
│               │   ├── TransactionHistoryController.java
│               │   └── WalletController.java
│               │
│               ├── dto
│               │   ├── AdminLogDTO.java
│               │   ├── BusinessProfileDTO.java
│               │   ├── BusinessVerificationDTO.java
│               │   ├── InvoiceDTO.java
│               │   ├── LoanDTO.java
│               │   ├── LoanPaymentDTO.java
│               │   ├── MoneyRequestDTO.java
│               │   ├── NotificationDTO.java
│               │   ├── PaymentMethodDTO.java
│               │   ├── RegisterRequest.java
│               │   ├── TransactionDTO.java
│               │   ├── UserDTO.java
│               │   └── WalletDTO.java
│               │
│               ├── entity
│               │   ├── AdminLog.java
│               │   ├── BusinessProfile.java
│               │   ├── BusinessVerification.java
│               │   ├── Invoice.java
│               │   ├── Loan.java
│               │   ├── LoanPayment.java
│               │   ├── MoneyRequest.java
│               │   ├── Notification.java
│               │   ├── OtpVerification.java
│               │   ├── PaymentMethod.java
│               │   ├── Role.java
│               │   ├── Transaction.java
│               │   └── User.java
│               │
│               ├── repository
│               │   ├── AdminLogRepository.java
│               │   ├── BusinessProfileRepository.java
│               │   ├── BusinessVerificationRepository.java
│               │   ├── InvoiceRepository.java
│               │   ├── LoanPaymentRepository.java
│               │   ├── LoanRepository.java
│               │   ├── MoneyRequestRepository.java
│               │   ├── NotificationRepository.java
│               │   ├── OtpRepository.java
│               │   ├── PaymentMethodRepository.java
│               │   ├── TransactionRepository.java
│               │   └── UserRepository.java
│               │
│               ├── security
│               │   └── CustomUserDetailsService.java
│               │
│               ├── service
│               │   ├── AdminLogService.java
│               │   ├── AdminService.java
│               │   ├── BusinessProfileService.java
│               │   ├── BusinessVerificationService.java
│               │   ├── FraudDetectionService.java
│               │   ├── InvoiceService.java
│               │   ├── LoanPaymentService.java
│               │   ├── LoanService.java
│               │   ├── MoneyRequestService.java
│               │   ├── NotificationService.java
│               │   ├── OtpService.java
│               │   ├── PaymentMethodService.java
│               │   ├── TransactionService.java
│               │   ├── UserService.java
│               │   └── WalletService.java
│               │
│               ├── serviceimpl
│               │   ├── AdminLogServiceImpl.java
│               │   ├── AdminServiceImpl.java
│               │   ├── BusinessProfileServiceImpl.java
│               │   ├── BusinessVerificationServiceImpl.java
│               │   ├── InvoiceServiceImpl.java
│               │   ├── LoanPaymentServiceImpl.java
│               │   ├── LoanServiceImpl.java
│               │   ├── MoneyRequestServiceImpl.java
│               │   ├── NotificationServiceImpl.java
│               │   ├── PaymentMethodServiceImpl.java
│               │   ├── TransactionServiceImpl.java
│               │   ├── UserServiceImpl.java
│               │   └── WalletServiceImpl.java
│               │
│               └── RevpayApplication.javaa

```

---

## 💰 Transaction Workflow

The RevPay platform enables secure **peer-to-peer digital payments** through a wallet-based transaction system.

### Transaction Flow

```
User Login
    ↓
User Initiates Payment
    ↓
Transaction Request Sent to Controller
    ↓
Controller Validates Request
    ↓
Service Layer Processes Business Logic
    ↓
Check Wallet Balance
    ↓
Fraud Detection Check
    ↓
Transaction Created
    ↓
Sender Wallet Debited
    ↓
Receiver Wallet Credited
    ↓
Transaction Saved in Database
    ↓
Notification Sent to Users
```

### Detailed Steps

1. **User Authentication**
   - User logs into the RevPay system using secure authentication.

2. **Initiate Transaction**
   - User enters recipient details and transaction amount.

3. **Controller Processing**
   - `TransactionController` receives the request.

4. **Service Layer Validation**
   - `TransactionService` validates transaction details.
   - Ensures sufficient wallet balance.

5. **Fraud Detection**
   - `FraudDetectionService` analyzes suspicious patterns.

6. **Wallet Update**
   - Sender wallet balance is **deducted**.
   - Receiver wallet balance is **credited**.

7. **Database Storage**
   - Transaction details are stored in the **Transaction table**.

8. **Notification System**
   - Both users receive transaction confirmation notifications.

### Components Involved

| Layer | Component |
|------|-----------|
Controller | `TransactionController` |
Service | `TransactionService` |
Fraud Detection | `FraudDetectionService` |
Repository | `TransactionRepository` |
Entity | `Transaction` |

---

## ⚙️ Setup Instructions

### 1. Clone the Repository

```
git clone https://github.com/NaveenkumarDeivasigamani/revpay-fullstack-fintech.git
```

### 2. Navigate to Project Folder

```
cd revpay-fullstack-fintech
```

### 3. Configure Database

Update `application.properties`

```
spring.datasource.url=jdbc:mysql://localhost:3306/revpay_app
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### 4. Build the Project

```
mvn clean install
```

### 5. Run the Application

```
mvn spring-boot:run
```

Application will start at:

```
http://localhost:8070
```

---

## 🗄 Database

Database Name:

```
revpay_app
```

Main Tables:

- users
- admin_log
- transactions
- payment_methods
- invoices
- loans
- loan_payment
- notifications
- business_profiles
- business_verification
- money_requests

---

## 🔐 Security

The system uses **Spring Security** for authentication and authorization.

Security features include:

- Password encryption using BCrypt
- Role-based access control
- OTP verification
- Secure login system

---

## 📊 Key Modules

### User Module
Handles user registration, login, and profile management.

### Wallet Module
Manages wallet balance and payment transactions.

### Transaction Module
Handles peer-to-peer transfers and transaction history.

### Business Module
Handles business verification and invoice generation.

### Loan Module
Manages loan application and repayment tracking.

### Admin Module
Monitors system activities and logs.

---

## 👨‍💻 Author

**Naveenkumar Deivasigamani**

Computer Science Engineer  
Backend Developer (Java / Python)

GitHub:  
https://github.com/NaveenkumarDeivasigamani