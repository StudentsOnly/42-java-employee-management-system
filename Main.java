public class Main{
    public static void main(String[] args) {

        Manager manager = new Manager("Alice Smith", 101, 5000);
        Technician technician = new Technician("Bob Johnson", 102, 20, 160);


        System.out.println("Manager Information:");
        manager.displayEmployeeInfo();


        System.out.println("\nTechnician Information:");
        technician.displayEmployeeInfo();
        double techSalary = technician.calculateSalary();
        System.out.println("Technician's Annual Salary: " + techSalary);
    }
}
