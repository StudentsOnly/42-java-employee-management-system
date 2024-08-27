public class Manager extends Employee {

    private double monthlySalary;

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary * 12;
    }

    @Override
    public void displayEmployeeInfo() {

        System.out.println(getClass().getSimpleName() + "\nID: " + getEmployeeId()
                + "\nName: " + getName() + "\nMonthly salary: $" + monthlySalary);
        System.out.println();

    }
}
