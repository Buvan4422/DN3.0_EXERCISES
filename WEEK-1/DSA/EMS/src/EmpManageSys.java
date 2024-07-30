import java.util.ArrayList;
import java.util.List;

public class EmpManageSys {
    private List<Emp> employees;

    public EmpManageSys() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Emp employee) {
        employees.add(employee);
        System.out.println("Employee " + employee.getName() + " added.");
    }

    public Emp searchEmployee(int employeeId) {
        for (Emp employee : employees) {
            if (employee.getEmpId() == employeeId) {
                return employee;
            }
        }
        return null;
    }

    public void traverseEmployees() {
        for (Emp employee : employees) {
            System.out.println(employee);
        }
    }

    public void deleteEmployee(int employeeId) {
        Emp employeeToDelete = null;
        for (Emp employee : employees) {
            if (employee.getEmpId() == employeeId) {
                employeeToDelete = employee;
                break;
            }
        }
        if (employeeToDelete != null) {
            employees.remove(employeeToDelete);
            System.out.println("Employee with ID " + employeeId + " deleted.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    public static void main(String[] args) {
        EmpManageSys ems = new EmpManageSys();

        ems.addEmployee(new Emp(1, "Buvan", "Manager", 900000.0));
        ems.addEmployee(new Emp(2, "Raju", "Asst. Manager", 70000.0));
        ems.addEmployee(new Emp(3, "Jaggu", "SDE", 65000.0));
        //ems.addEmployee(new Emp());
        System.out.println();

        Emp emp = ems.searchEmployee(2);
        if (emp != null) {
            System.out.println("Found: " + emp);
        } else {
            System.out.println("Employee not found.");
        }
        System.out.println();

        // Traversing employees
        System.out.println("All employees:");
        ems.traverseEmployees();
        System.out.println();

        // Deleting an employee
        ems.deleteEmployee(2);
        System.out.println();

        // Traversing employees again
        System.out.println("All employees after deletion:");
        ems.traverseEmployees();
    }
}
