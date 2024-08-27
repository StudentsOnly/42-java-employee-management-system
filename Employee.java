public abstract class Employee {

    private String name;
    private int employeeId;


    public abstract double calculateSalary();
    public abstract void displayEmployeeInfo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}
