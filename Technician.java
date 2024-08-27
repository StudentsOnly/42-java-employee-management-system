public class Technician extends Employee{

    private double hourlyRate;
    private double hoursWorked;

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked * 4 * 12;
    }

    @Override
    public void displayEmployeeInfo() {

        System.out.println("\nTechnician (ID " + this.getEmployeeID() + "):");
        System.out.println("\tName: " + this.getName());
        System.out.println("\tSalary: " + String.format("%.2f", calculateSalary()) + "$");

    }
}
