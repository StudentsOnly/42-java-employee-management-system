public class Technician extends Employee {

    private double hourlyRate;
    private int hoursWorked;

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hoursWorked * hourlyRate * 4 * 12;
    }

    @Override
    public void displayEmployeeInfo() {

        System.out.println(getClass().getSimpleName() + "\nID: " + getEmployeeId()
                + "\nName: " + getName() + "\nHourly Rate: $" + hourlyRate
                + "\nHours Worked: " + hoursWorked);
        System.out.println();

    }
}
