class Technician extends Employee {
    private double hourlyRate;
    private int hoursWorked;

   public Technician(String name, int employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

   public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked * 4 * 12; // Salary calculated as hourlyRate * hoursWorked * 4 * 12
    }

        @Override
    public void displayEmployeeInfo() {
        System.out.println("Technician Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Hourly Rate: " + hourlyRate);
    }
}
