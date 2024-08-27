public class Technician extends Employee {

    private double hourlyRate;

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary(int hoursWorked) {
        return hoursWorked * hourlyRate * 4 * 12;
    }

    @Override
    public double calculateSalary() {
        System.out.println("calculateSalary() not implemented, " +
                "use calculateSalary(int hoursWorked) instead.");
        return -1.0;
    }

    @Override
    public void displayEmployeeInfo() {

        System.out.println(getClass().getSimpleName() + "\nID: " + getEmployeeId()
                + "\nName: " + getName() + "\nHourly Rate: $" + hourlyRate);
        System.out.println();

    }
}
