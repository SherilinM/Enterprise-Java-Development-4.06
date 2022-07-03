package service.interfaces;

import enums.Status;
import model.Employee;

public interface IEmployeeService {

    //crear ruta para agregar nuvo empleado
    public Employee addNewEmployee(Employee employee);

    //Crear ruta cambiar el estatus del empleado
    public void changeEmployeeStatus(Integer employeeId, Status status);

    //Crear ruta cambiar el nombre del empleado
    public void changeEmployeeName(Integer employeeId, String name);

    //crear ruta cambiar el departamento del empleado
    public void changeEmployeeDepartment(Integer employeeId, String department);
}
