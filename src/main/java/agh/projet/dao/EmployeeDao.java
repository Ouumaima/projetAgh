package agh.projet.dao;


import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import agh.projet.bean.EmployeeBean;

@Repository
public class EmployeeDao   {
	
	private ArrayList<EmployeeBean> listEmployee = new ArrayList<EmployeeBean>();
	
	public ArrayList<EmployeeBean> getEmployee() {
		return  listEmployee;
	}
	
	public void save(EmployeeBean employee) {
		listEmployee.add(employee);
    }
	
	public void delete(EmployeeBean employee) {
		listEmployee.remove(employee);
    }
	
	public ArrayList<EmployeeBean> getEmployeeById(int id) {
		ArrayList<EmployeeBean> result = new ArrayList<EmployeeBean>();
		for (EmployeeBean e : listEmployee)
			if (e.getId() == id  )
				result.add(e);
		return  result;
	}
	
	public ArrayList<EmployeeBean> getEmployeeByFirstName(String firstName) {
		ArrayList<EmployeeBean> result = new ArrayList<EmployeeBean>();
		for (EmployeeBean e : listEmployee)
			if (e.getFirstName().equals(firstName)  )
				result.add(e);
		return  result;
	}
	
}
