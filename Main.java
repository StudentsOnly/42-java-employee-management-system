public class Main{

    public static void main(String[] args) {

        System.out.println("----------------------");
        Manager manager = new Manager();
        manager.setEmployeeId(12345);
        manager.setName("John Doe");
        manager.setMonthlySalary(5000.0);

        manager.displayEmployeeInfo();
        System.out.println("Manager Salary: $" + manager.calculateSalary());
        System.out.println();

        System.out.println("----------------------");
        Technician technician = new Technician();
        technician.setEmployeeId(12345);
        technician.setName("John Doe");
        technician.setHourlyRate(25.0);

        technician.displayEmployeeInfo();
        System.out.println("Technician Salary: $" + technician.calculateSalary(40));
    }
}
