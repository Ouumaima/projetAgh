package services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.Employee;
import dao.EmployeeDao;


@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao employee ;
	

	public ArrayList<Employee> getAll(){
		 return employee.findAll();
	}
	
	public ArrayList<Employee> getById(int id){
		 return employee.findById(id);
	}
		
	public ArrayList<Employee> getByFirstName(String firstName){
		 return employee.findByFirstName(firstName);
	}
	public void save(Employee e){
		 employee.add(e);
	}
	
	public void delete(Employee e){
		 employee.remove(e);
	}
	
	public void deleteById(int id){
		 employee.removeById(id);
	}
	

}
