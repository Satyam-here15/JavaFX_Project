# 🎯 JavaFX Student Grade Manager

A simple **JavaFX desktop application** for managing student records — allowing users to **add new students** and **view the list of existing students** in a clean graphical interface.

This project demonstrates how to integrate **JavaFX UI** with **file handling** (using a `.txt` file for storage) and apply **core Java Object-Oriented Programming (OOP)** principles.

---

## 🚀 Features

✅ Add new student details (name, ID, marks, grade)  
✅ Display all student records in a user-friendly table view  
✅ Automatically calculate grades based on marks  
✅ Data stored persistently in a local file (`students.txt`)  
✅ Simple and clean JavaFX interface  
✅ Demonstrates modular and object-oriented design

---

## 🧠 Java Concepts Used

| Concept | Description | Example in Project |
|----------|--------------|--------------------|
| **OOP (Classes & Objects)** | Represents students using a dedicated `Student` class | `Student.java` |
| **Encapsulation** | Student data (name, ID, grade) kept private with getters/setters | `Student.java` |
| **File Handling** | Data saved and loaded from a `.txt` file | `GradeManager.java` |
| **Collections Framework** | Uses `ArrayList<Student>` to store student data in memory | `GradeManager.java` |
| **JavaFX** | Builds GUI with buttons, text fields, and a table view | `Main.java` |
| **Exception Handling** | Safely handles file read/write errors | `GradeManager.java` |
| **Modular Programming** | Code split into logical components (Student, GradeManager, Main) | `src` folder structure |

---

## 🏗️ Project Architecture

User Interface (JavaFX)
↓

Controller (Main.java)
↓

Logic Handler (GradeManager.java)
↓

Storage (students.txt)


---

## ⚙️ Tech Stack

| Category | Tool |
|-----------|------|
| **Language** | Java 17+ |
| **Framework** | JavaFX |
| **Storage** | File Handling (`students.txt`) |
| **IDE** | IntelliJ IDEA |
| **Version Control** | Git & GitHub |

---

## ⚙️ Setup Instructions

1️⃣ Clone this repository
git clone https://github.com/Satyam-here15/JavaFX_Project.git

2️⃣ Open the project in IntelliJ IDEA
File → Open → Select the folder
Ensure JavaFX SDK is properly configured

3️⃣ Configure JavaFX SDK (if not already)
File → Project Structure → Libraries → Add JavaFX SDK path

Optional: Add the following VM options if JavaFX is not running
--module-path "path\to\javafx\lib" --add-modules javafx.controls,javafx.fxml

4️⃣ Run the application
Open Main.java and click ▶️ Run

---

## 📂 Folder Structure

```bash
Student-Grade-Tracker/
│
├── src/
│   ├── application/
│   │   ├── Main.java
│   │   ├── Student.java
│   │   ├── GradeManager.java
│
├── data/
│   └── students.txt
│
├── .gitignore
└── README.md

```

---

## 📸 Screenshots

### 🧩 Add Student Form
This screen allows you to enter student details like **Name**, **ID**, and **Marks**, and automatically calculates the **Grade**.

![Add Student Form](https://github.com/user-attachments/assets/308fce29-fa64-44b2-b545-a9901122f00f)

---

### 📊 Student Records Table View
Displays all stored students in a structured table format.  
Each record is loaded from the `students.txt` file and displayed in real-time.

![Table View](https://github.com/user-attachments/assets/d7e75155-4322-40f5-b47a-9c671bf93e58)

---

### 💾 Data Persistence
All records are saved in a local file (`students.txt`), ensuring that data remains even after restarting the app.

![Data Saved](https://github.com/user-attachments/assets/4ac7dda3-fc46-4b72-b0c4-ff7c53f02b73)

---



## 💡 Future Enhancements

🔹 Add Update & Delete functionalities  
🔹 Implement Search by Student ID  
🔹 Connect to a SQL Database (MySQL/PostgreSQL)  
🔹 Add charts or visual reports using JavaFX  
🔹 Deploy as a desktop executable (.jar)

---

## 🧑‍💻 Author

**Satyam Upadhyay**  
🎓 Student | 💻 Java Developer | ☁️ Cloud & Database Enthusiast  
📧 [satyam.work15@gmail.com ]()
🌐 [GitHub Profile](https://github.com/Satyam-here15)

⭐ *If you like this project, don't forget to star the repo!*
