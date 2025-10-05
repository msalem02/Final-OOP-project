# Final Object-Oriented Programming (OOP) Project  
### Comprehensive Application Demonstrating Core OOP Concepts in C++ / Java

---

## 1. Overview

The **Final OOP Project** represents a complete demonstration of **Object-Oriented Programming principles** — encapsulation, inheritance, polymorphism, and abstraction — through a structured, real-world inspired software system.  
It was developed as a capstone for the Object-Oriented Programming course to integrate all theoretical and practical concepts into one cohesive, functioning application.

This project provides a modular, extensible codebase using modern programming standards.  
Depending on the course requirements, it can be implemented in **C++** or **Java**, with an emphasis on **clean architecture**, **reusability**, and **maintainability**.

---

## 2. Objectives

- Apply OOP principles (Encapsulation, Inheritance, Polymorphism, Abstraction).  
- Build a modular, reusable application with multiple interacting classes.  
- Practice design patterns such as **MVC (Model–View–Controller)** or **Observer**.  
- Demonstrate file handling, user interaction, and data persistence.  
- Write clean, well-commented, and maintainable code.  
- Apply UML-based design and documentation.

---

## 3. Project Structure

```
Final-OOP-Project/
│
├── src/
│   ├── main.cpp / Main.java            # Main entry point
│   ├── classes/
│   │   ├── Person.cpp / .java          # Base class
│   │   ├── Employee.cpp / .java        # Derived class
│   │   ├── Manager.cpp / .java         # Further inheritance
│   │   ├── Department.cpp / .java      # Aggregation of employees
│   │   ├── Project.cpp / .java         # Composition with Department
│   │   └── Utils.cpp / .java           # Helper utilities
│   │
│   ├── data/
│   │   ├── input.txt                   # Sample input data
│   │   └── output.txt                  # Program output logs
│   │
│   ├── interfaces/
│   │   ├── Printable.h / .java         # Demonstrates interface or abstract class
│   │   ├── Storable.h / .java
│   │
│   ├── exceptions/
│   │   ├── FileNotFoundException.cpp
│   │   ├── InvalidInputException.cpp
│   │   └── ValidationError.cpp
│   │
│   ├── Makefile / build.xml            # Build automation
│   ├── UML_Diagram.png                 # UML class diagram (if included)
│   └── README.md
│
├── tests/
│   ├── test_employee.txt
│   ├── test_department.txt
│   └── run_tests.sh
│
└── docs/
    ├── DesignDocument.pdf
    ├── ClassDiagram.png
    └── UserManual.pdf
```

---

## 4. Core OOP Concepts Demonstrated

### 4.1 Encapsulation  
Each class contains its **own attributes and behaviors**, hiding internal details through private members and exposing only necessary interfaces.

Example (C++):
```cpp
class Employee {
private:
    string name;
    double salary;
public:
    Employee(string n, double s) : name(n), salary(s) {}
    void displayInfo();
    void setSalary(double s);
    double getSalary() const;
};
```

### 4.2 Inheritance  
Child classes extend parent classes to reuse logic and specialize behavior.

Example:
```cpp
class Manager : public Employee {
private:
    int teamSize;
public:
    Manager(string n, double s, int t) : Employee(n, s), teamSize(t) {}
    void displayInfo(); // Overridden
};
```

### 4.3 Polymorphism  
Methods can be overridden dynamically, allowing flexible object behavior.

Example:
```cpp
Employee* e1 = new Manager("John", 5000, 5);
e1->displayInfo();  // Calls Manager version (runtime polymorphism)
```

### 4.4 Abstraction  
Uses abstract base classes or interfaces to enforce contracts on derived classes.

Example (Java):
```java
public interface Printable {
    void printDetails();
}
```

---

## 5. Program Flow

1. **Initialization:** Load input data or initialize class objects.  
2. **User Interaction:** Menu-driven or console-based interface allows user operations.  
3. **Core Processing:** Classes handle all logic internally.  
4. **Output Generation:** Results written to console or `output.txt`.  
5. **Persistence (optional):** Save or load data from file.  

---

## 6. Example Menu (if console-based)

```
========= OOP SYSTEM MENU =========
1. Add New Employee
2. Add Manager
3. View All Employees
4. Search Employee by ID
5. Update Employee Salary
6. Display Department Summary
7. Exit
==================================
Enter your choice:
```

---

## 7. Example Input / Output

### Input (input.txt)
```
EMPLOYEE John 3000
EMPLOYEE Alice 2800
MANAGER Sarah 5000 4
DISPLAY_ALL
```

### Output (output.txt)
```
Employee: John | Salary: 3000
Employee: Alice | Salary: 2800
Manager: Sarah | Salary: 5000 | Team Size: 4
```

---

## 8. Error Handling

- **Invalid Input:** Checks for wrong data types or empty fields.  
- **File Errors:** Graceful error messages for missing files.  
- **Data Validation:** Prevents invalid salary or negative IDs.  
- **Exception Handling:** Implemented through try-catch blocks or custom exceptions.  

---

## 9. Design Patterns Used

- **Factory Pattern:** For object creation (Employee / Manager).  
- **Singleton Pattern:** For configuration or file manager class.  
- **MVC Pattern:** Separation between data (Model), logic (Controller), and display (View).  
- **Strategy Pattern (optional):** Used for different data sorting techniques.

---

## 10. UML Class Diagram (Conceptual)

```
+-------------------+          +------------------+
|     Person        |<-------->|   Department     |
+-------------------+          +------------------+
| - name            |          | - deptName       |
| - id              |          | - employees[]    |
+-------------------+          +------------------+
| + getName()       |          | + addEmployee()  |
| + getID()         |          | + showDetails()  |
+-------------------+          +------------------+
        ^
        |
        |
+-------------------+
|    Employee       |
+-------------------+
| - salary          |
| + getSalary()     |
| + displayInfo()   |
+-------------------+
        ^
        |
+-------------------+
|     Manager       |
+-------------------+
| - teamSize        |
| + displayInfo()   |
+-------------------+
```

---

## 11. Testing

### Unit Testing
- Test object creation, data accessors, and inheritance behavior.  
- Verify overridden methods produce correct output.

### Integration Testing
- Ensure classes interact correctly (e.g., `Department` managing multiple `Employee` objects).

### Automated Tests
```bash
./tests/run_tests.sh
```

---

## 12. Build & Run Instructions

### For C++ (GCC)
```bash
g++ src/*.cpp -o oop_app
./oop_app
```

### For Java
```bash
javac src/*.java
java src/Main
```

### Using Makefile
```bash
make
./oop_app
```

---

## 13. Educational Insights

Through this project, students gain mastery in:
- Implementing **class hierarchies and inheritance trees.**
- Using **abstraction and polymorphism** in real systems.  
- Writing **modular, maintainable code.**
- Applying **software design patterns.**
- Documenting code with **UML and Doxygen-style comments.**

---

## 14. Future Enhancements

- Integrate **database connectivity (MySQL / SQLite)** for persistent data.  
- Add **GUI interface (Qt / JavaFX / Tkinter)**.  
- Extend **multi-threaded processing** for concurrent tasks.  
- Implement **serialization** for saving/loading entire objects.  
- Introduce **REST API** layer for networked data access.

---

## 15. Author

Mohammed Salem  
Email: salemmohamad926@gmail.com  
LinkedIn: https://www.linkedin.com/in/msalem02  
GitHub: https://github.com/msalem02  

---

## 16. License

This project is licensed under the **MIT License**.  
You may freely use, modify, and distribute it with proper attribution.

---

## 17. Acknowledgements

- Birzeit University — Computer Engineering Department  
- Object-Oriented Programming course staff and mentors  
- Open-source developer community for design references  
- Fellow students for peer review and collaboration

---

## 18. Version History

| Version | Date | Description |
|----------|------|-------------|
| 1.0 | February 2024 | Initial class structure and UML design |
| 1.1 | March 2024 | Implemented inheritance and polymorphism |
| 1.2 | April 2024 | Added file handling and exception management |
| 2.0 | June 2024 | Integrated MVC and factory design pattern |
