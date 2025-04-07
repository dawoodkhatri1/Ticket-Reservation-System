# :ticket: Java Ticket Reservation System

A simple **Java console-based ticket reservation system** that allows users to book tickets for **Bus**, **Train**, and **Aeroplane**. After booking, users can view a receipt with full booking details. The system is built using **Object-Oriented Programming (OOP)** principles and is structured for easy maintenance and scalability.

---

## :rocket: Features

- :white_check_mark: Book tickets for:
  - :bus: Bus
  - :train: Train
  - :airplane: Aeroplane
- :white_check_mark: View and print a detailed **receipt** after booking
- :white_check_mark: Uses OOP principles:
  - Inheritance
  - Polymorphism
  - Encapsulation
- :white_check_mark: Easy-to-understand codebase for beginners

---

## :bricks: Technologies Used

- **Java (JDK 8+)**
- **Java Swing** (for GUI)
- **JDBC (Java Database Connectivity)**
- **MySQL** 
- **Maven/Gradle** for dependency management

---

## :hammer_and_wrench: How to Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/dawoodkhatri1/Ticket-Reservation-System.git
   ```

2. **Set up the database**:
   - Create a database (e.g., `ticket_system`)
   - Import the provided SQL file or manually create tables:
     - `tickets`, `users` (optional), etc.
   - Configure DB credentials in `DatabaseConnection.java`

3. **Build and run the project**:
   - Using an IDE like IntelliJ IDEA, Eclipse, or NetBeans:
     - Open project
     - Configure database if needed
     - Run `Main.java`
   - Or compile via terminal:
     ```bash
     javac Main.java
     java Main
     ```

---

## :pushpin: Future Improvements

- :busts_in_silhouette: Add user authentication and roles
- :credit_card: Payment gateway simulation
- :bar_chart: Admin dashboard for viewing all bookings
- :globe_with_meridians: Multi-language support
- :printer: Print receipt feature

---

## :handshake: Contributing

Contributions are welcome! Fork the project, create a new branch, and submit a pull request.

---
