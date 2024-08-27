abstract class Employee {
    private String name;
    private int employeeID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public abstract double calculateSalary();

    public abstract void displayEmployeeInfo();
}
