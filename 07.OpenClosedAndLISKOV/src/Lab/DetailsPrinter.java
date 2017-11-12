package Lab;

public class DetailsPrinter {

    private Iterable<Employee> employees;

    public DetailsPrinter(Iterable<Employee> employees) {
        this.employees = employees;
    }

    public void printDetails() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private void printEmployee(Employee employee) {
        System.out.println(employee);
    }

    private void printManager(Manager manager) {
        System.out.println(manager);
    }
}
