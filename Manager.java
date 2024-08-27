public class Manager extends Employee{

    private double monthlySalary;

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return this.monthlySalary * 12;
    }

    @Override
    public void displayEmployeeInfo() {

        System.out.println("\nManager (ID " + this.getEmployeeID() + "):");
        System.out.println("\tName: " + this.getName());
        System.out.println("\tSalary: " + String.format("%.2f", calculateSalary()) + "$");

    }
}
