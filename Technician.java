public class Technician extends Employee {

    private double hourlyRate;

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary() {
        int hoursWorked = 40;
        return hoursWorked * hourlyRate * 4 * 12;
    }

    @Override
    public void displayEmployeeInfo() {

        System.out.println(getClass().getSimpleName() + "\nID: " + getEmployeeId()
                + "\nName: " + getName() + "\nHourly Rate: $" + hourlyRate);
        System.out.println();

    }
}
