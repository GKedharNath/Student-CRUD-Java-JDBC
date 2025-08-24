
# 🎓 Student CRUD Application (Java + JDBC + MySQL)

This is a simple **console-based CRUD (Create, Read, Update, Delete) application** for managing student records.  
It is built using **Java**, **JDBC**, and **MySQL** with a modular structure (separate classes for DB connection, queries, student model, CRUD operations, and main application).

---

## 🚀 Features
- Insert new student records  
- Read all student records  
- Update student details  
- Delete student records  
- Console-based menu-driven application  

---

## 🛠️ Tech Stack
- **Java (JDK 17 or above recommended)**  
- **JDBC** (Java Database Connectivity)  
- **MySQL 8.0+**  

---

## 📂 Project Structure


myPackage/
│
├── DBConnection.java      # Handles database connection
├── Student2.java          # Student model (data class)
├── StudentQueries.java    # SQL queries in one place
├── StudentCRUD.java       # CRUD operations (Insert, Read, Update, Delete)
└── App.java               # Main application (menu-driven)



---

## ⚙️ Setup & Installation
1. Clone this repository:
   bash
   git clone https://github.com/<your-username>/Student-CRUD-Java-JDBC.git
   cd Student-CRUD-Java-JDBC


2. Create a MySQL database:

   sql
   CREATE DATABASE myjdbc;
   USE myjdbc;

   CREATE TABLE student (
       sid INT PRIMARY KEY,
       sname VARCHAR(50),
       branch VARCHAR(50)
   );
   

3. Update **DBConnection.java** with your MySQL credentials:

   java
   private static final String URL = "jdbc:mysql://localhost:3306/myjdbc";
   private static final String USER = "root";
   private static final String PASS = "your_password";
   

4. Compile and run the project:

   bash
   javac myPackage/*.java
   java myPackage.App
   

---

##📋 Sample Menu


---- Student CRUD Application ----
1. Insert student
2. Read student
3. Update student
4. Delete student
5. Exit
Enter your choice:


---

## 🔮 Future Enhancements

* Add validations & exception handling
* Implement logging
* Extend with a **Swing/JavaFX GUI** or REST API

---

## 👤 Author

**Kedharnath**
📍 B.Tech CSE | KL University, Vijayawada
💼 Aspiring Java Developer | Strong foundation in Java, OOP, and Databases

---

⭐ If you like this project, don’t forget to **star this repo**!

