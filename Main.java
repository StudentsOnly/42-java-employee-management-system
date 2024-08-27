public class Main{
    public static void main(String[] args) {

        Manager manager = new Manager();
        Technician middleDev = new Technician();

        manager.setEmployeeID(6645);
        manager.setName("Marco Wolf");
        manager.setMonthlySalary(7560);

        middleDev.setEmployeeID(2211);
        middleDev.setName("Tobias Thomke");
        middleDev.setHourlyRate(190.2);
        middleDev.setHoursWorked(8);

        manager.displayEmployeeInfo();
        middleDev.displayEmployeeInfo();
    }

}
