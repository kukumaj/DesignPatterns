package MVC;

import MVC.controller.EmployeeController;
import MVC.model.Employee;
import MVC.view.EmployeeDashboardView;

public class Main {
    public static void main(String[] args) {
        Employee employee = retrieveEmployeeFromServer();
        //Create our view to which we'll write our employee information into
        EmployeeDashboardView view = new EmployeeDashboardView();
        //Create our controller
        EmployeeController controller = new EmployeeController(employee, view);
//        controller.setEmployee(employee.getFirstName(), employee.getLastName());
        controller.updateDashboardView();
    }

    public static Employee retrieveEmployeeFromServer() {
        Employee employee = new Employee();
        employee.setSsNumber("32765523");
        employee.setFirstName("James");
        employee.setLastName("Bond");
        employee.setSalary(125000);
        return employee;
    }
}
//Name: James Bond
//SSN: 32765523
//Salary: 125000.0