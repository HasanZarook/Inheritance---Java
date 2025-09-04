
# 🏢 Inheritance Example: Employee & Faculty Salary Calculation

This Java project demonstrates **inheritance**, **method overriding**, and **polymorphism** in object-oriented programming.  
It calculates salaries for `Employee` and `Faculty` objects with various allowances and education-based adjustments.

---

## 📝 Classes Overview

### 1. `Person`
- Base class for all people.
- Attributes: `name` and `address`.

### 2. `Employee` (inherits `Person`)
- Attributes: `Emp_no`, `salary`, `house_rent`, `medical_allow`.
- Method: `calcSalary()` calculates the total salary of the employee.

### 3. `Faculty` (inherits `Employee`)
- Attributes: `designation`, `department`, `years_of_education`, `some_amount`.
- Overrides `calcSalary()` to adjust salary based on years of education.

### 4. `drive_of_department`
- Main class to create `Employee` and `Faculty` objects.
- Demonstrates **method overriding** and **inheritance**.

---

## 🚀 How to Run

1. Clone or download the repository.
2. Compile the program:
```bash
javac drive_of_department.java
````

3. Run the program:

```bash
java drive_of_department
```

4. Output will display calculated salaries and object details.

---

## ⚡ Example Output

```
Employee total Salary :14285.714
Faculty total Salary :4761.905
Person{name='Hasan', address='Srilanka'} ==> Employee{Emp_no=100, salary=20000.0, house_rent=0.1, medical_allow=0.3}
Person{name='Zrk', address='Srilanka'} ==> Employee{Emp_no=200, salary=10000.0, house_rent=0.2, medical_allow=0.4} ==> Faculty{designation='professor', department='ComputerEng', years_of_education=20, some_amount=2000.0}
```

---

## 🛠 Concepts Demonstrated

* **Inheritance** (`extends`)
* **Method Overriding**
* **Polymorphism**
* **Salary calculation logic** with conditions

---

## 📜 License

This project is licensed under the **MIT License**.
You are free to use, modify, and distribute this code.

---

