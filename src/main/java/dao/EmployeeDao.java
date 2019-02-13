package dao;


import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import bean.Employee;




@Repository
public class EmployeeDao {

private ArrayList<Employee> listEmployee = new ArrayList<Employee>();
	
	public ArrayList<Employee> findAll() {
		return  listEmployee;
	}
	
	public void add(Employee employee) {
		listEmployee.add(employee);
    }
	
	public void remove(Employee employee) {
		listEmployee.remove(employee);
    }
	
	public void removeById(int id) {
		for (Employee e : listEmployee)
			if (e.getId() == id  )
				listEmployee.remove(e);
    }
	
	public ArrayList<Employee> findById(int id) {
		ArrayList<Employee> result = new ArrayList<Employee>();
		for (Employee e : listEmployee)
			if (e.getId() == id  )
				result.add(e);
		return  result;
	}
	
	public ArrayList<Employee> findByFirstName(String firstName) {
		ArrayList<Employee> result = new ArrayList<Employee>();
		for (Employee e : listEmployee)
			if (e.getFirstName().equals(firstName)  )
				result.add(e);
		return  result;
	}
}
