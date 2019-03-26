package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.Employee;
import dao.EmployeeDao;


@Service
public class EmployeeService {
	
	private EmployeeDao employee ;
	
	public EmployeeService(EmployeeDao employee) {
		this.employee = employee;
	}

	public List<Employee> getAll(){
		 return employee.findAll();
	}
	
	public Employee getById(int id){
		 return employee.findById(id);
	}
		
	public void save(Employee e){
		 employee.add(e);
	}
	
	public void updateEmployee(int id, Employee e){
		employee.updateEmployee(id, e);
	}
	
	public void deleteById(int id){
		 employee.deleteEmployeeById(id);
	}
	

}
