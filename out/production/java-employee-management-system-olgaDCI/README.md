## Exercise: Abstract Classes - Employee Management System

#### Objective:

Practice using abstract classes in Java by creating an employee management system.

#### Description:

You should create an employee management system that manages different types of employees. Implement an abstract class Employee with common attributes and methods, and two concrete derived classes: Manager and Technician. Each employee type should have specific properties and methods, and the ability to calculate their salaries based on their roles.

#### Guidelines:

1.	Create an abstract class Employee with the following instance variables:
  	- String name
  	- int employeeId
2.	Implement getter and setter methods for the name and employeeId instance variables.
3.	Include the following abstract methods in the Employee class:
  	- public abstract double calculateSalary() - to calculate the employee's salary.
  	- public abstract void displayEmployeeInfo() - to display the employee information.
4.	Create a concrete derived class Manager that inherits from Employee.
5.	Add an additional instance variable double monthlySalary to the Manager class.
6.	Implement the calculateSalary and displayEmployeeInfo methods in the Manager class. The manager's salary is calculated as monthlySalary * 12.
7.	Create another concrete derived class Technician that inherits from Employee.
8.	Add an additional instance variable double hourlyRate to the Technician class.
9.	Implement the calculateSalary and displayEmployeeInfo methods in the Technician class. The technician's salary is calculated as hourlyRate * hoursWorked * 4 * 12, where hoursWorked is a parameter.
10.	In the main method, create instances of Manager and Technician, set their attributes, and calculate their salaries. Display the employee information and salaries.
